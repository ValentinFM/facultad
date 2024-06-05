public class TablaDispersaEnlazada {
    //atributos
    private static final double R = 0.618034;
    private static int M = 97;
    private Elemento[] tabla;
    public int numElementos;
    //constructor
    public TablaDispersaEnlazada() 
    {
        tabla = new Elemento[M];
        for (int i = 0; i < M; i++) {
            tabla[i] = null;
        }
        numElementos = 0;
    }
    //metodo de dispersion
    int dispersion(long x) {
        double t;
        int v;
        t = R * x - Math.floor(R * x);
        v = (int) (M * t);
        return v;
    }
    //metodo insertar
    public void insertar(Socio s) {
        int posicion;
        Elemento nuevo;
        posicion = dispersion(s.getCodigo());
        nuevo = new Elemento(s);
        nuevo.sgte = tabla[posicion];
        tabla[posicion] = nuevo;
        numElementos++;
    }
    //metodo conforme
    boolean conforme(Socio a) {
        return true;
    }
    //metodo eliminar
    public void eliminar(int codigo) {
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null) // no está vacía
        {
            Elemento anterior, actual;
            anterior = null;
            actual = tabla[posicion];
            while ((actual.sgte != null) && actual.getSocio().getCodigo() != codigo) {
                anterior = actual;
                actual = actual.sgte;
            }
            if (actual.getSocio().getCodigo() != codigo) {
                System.out.println("No se encuentra en la tabla el socio " + codigo);
            } else if (conforme(actual.getSocio())) // se retira el nodo 
            {
                if (anterior == null) // primer nodo
                {
                    tabla[posicion] = actual.sgte;
                }
            } else {
                anterior.sgte = actual.sgte;
            }
            actual = null;
            numElementos--;

        }
    }
    //metodo ded busqueda
    public Elemento buscar(int codigo) {
        Elemento p = null;
        int posicion = dispersion(codigo);
        if (tabla[posicion] != null) {
            p = tabla[posicion];
            while ((p != null) && p.getSocio().getCodigo() != codigo) {
                p = p.sgte;
            }

            if (p != null && p.getSocio().getCodigo() != codigo) {
                p = null;
            }

        }
        return p;
    }
}
