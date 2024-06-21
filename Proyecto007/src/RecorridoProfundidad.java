import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RecorridoProfundidad {
    Scanner scc = new Scanner(System.in);
    int clave = -1;
    static Stack<Integer> pila = new Stack<>();
    static GrafoMatriz g = new GrafoMatriz();

    public void crearMatriz(){
        System.out.println("¿De que tamaño quiere la matriz?");
        int tam = scc.nextInt();
        g.setMatAd(new int[tam][tam]);
        g.setVertices(new Vertice[tam]);
        for (int i=0; i< tam ; i++){
            for (int j = 0; j < tam; j++){
                g.getMatAd()[i][j]=0;
            }
        }
        g.setNVertices(0);
    }
    public static int[] recorridoProfundidad(GrafoMatriz g,String org) throws Exception{
        int v, w;
        int[] m;
        m = new int[g.getNVertices()];
        v  = g.numVertice(org);
        if (v < 0) throw new Exception("El vertice del origen no existe");
        for ( int i = 0; i< g.getNVertices(); i++){
            m[i]= -1;
        }
        m[v]= 0;
        pila.add(v);
        while (!pila.isEmpty()){
            w = pila.pop();
            System.out.println("Vertice" + g.getVertices()[w] + "Visitado");

            for (int l= 0; l < g.getNVertices(); l++){
                if ((g.getMatAd()[w][l] == 1) && (m[l] == -1)   ){
                    pila.add(l);
                    m[l]= 1;
                }
            }
        }
        return m;
    }

    public void PrintMatriz(){
        int[][] matAd = g.getMatAd();
        for (int i = 0; i<matAd.length; i++){


            for(int j=0; j <matAd[i].length; j++){
                System.out.println(matAd[i][j] + " ");
            }
        }

    }
}
