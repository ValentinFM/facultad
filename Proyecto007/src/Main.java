import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Vertice> Letras = new ArrayList<Vertice>();
        Letras.add(new Vertice("A"));
        Letras.add(new Vertice("B"));
        Letras.add(new Vertice("C"));
        Letras.add(new Vertice("D"));
        Letras.add(new Vertice("H"));
        Letras.add(new Vertice("R"));
        Letras.add(new Vertice("T"));
        try {
            GrafoMatriz grafoMatriz = new GrafoMatriz(Letras.size());
            grafoMatriz.mostrarMatriz();
            System.out.println("");
            System.out.println("========================");
            System.out.println("");
            Iterator<Vertice> it = Letras.iterator();
            while(it.hasNext()){
                grafoMatriz.nuevoVertice(it.next().nomVertice());
            }
            grafoMatriz.mostrarMatriz();
            System.out.println("");
            System.out.println("=============================");
            System.out.println("");
            grafoMatriz.nuevoArco("D","B");
            grafoMatriz.nuevoArco("D","C");
            grafoMatriz.nuevoArco("B","H");
            grafoMatriz.nuevoArco("C","R");
            grafoMatriz.nuevoArco("R","H");
            grafoMatriz.nuevoArco("H","A");
            grafoMatriz.nuevoArco("H","T");
            grafoMatriz.mostrarMatriz();
            System.out.println("===============");
            System.out.println("");
            RecorridoProfundidad.recorridoProfundidad(grafoMatriz,"D");
        }        catch (Exception ex){
            System.out.println("No funciona");
        }
    }
}