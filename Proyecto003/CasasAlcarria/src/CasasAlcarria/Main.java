package CasasAlcarria;
public class Main {
    public static void main(String[] args) {
        TablaDispersa tablaDispersa = new TablaDispersa();
        CasaRural casaRural = new CasaRural("pedro","5000","casita123",100,69.3,true);
        tablaDispersa.insertar(casaRural);
        CasaRural aux;
        aux = tablaDispersa.buscar("pedro");
        System.out.println(aux.Muestra());


    }
}
