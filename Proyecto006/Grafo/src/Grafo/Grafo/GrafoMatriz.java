package Grafo;

public class GrafoMatriz {
    private int numVerts;
    private static final int MaxVerts = 20;
    private Vertice[] verts;
    private int[][] matAd;

    public GrafoMatriz() {
        this(MaxVerts);
    }

    public GrafoMatriz(int mx) {
        matAd = new int[mx][mx];
        verts = new Vertice[mx];
        for (int i = 0; i < mx; i++) {
            for (int j = 0; j < mx; j++) {
                matAd[i][j] = 0;
            }
        }
        numVerts = 0;
    }

    public Vertice[] obtenerVertices() {
        return verts;
    }

    public void nuevoVertice(String nom) {
        boolean esta = numVertice(nom) >= 0;
        if (!esta) {
            Vertice v = new Vertice(nom);
            v.asigVert(numVerts);
            verts[numVerts++] = v;
        }
    }

    public int numVertice(String vs) {
        Vertice v = new Vertice(vs);
        boolean encontrado = false;
        int i = 0;
        for (; i < numVerts && !encontrado; i++) {
            encontrado = verts[i].equals(v);
        }
        return encontrado ? i - 1 : -1;
    }

    public void nuevoArco(String a, String b) throws Exception {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        matAd[va][vb] = 1;
    }

    public boolean adyacente(String a, String b) throws Exception {
        int va = numVertice(a);
        int vb = numVertice(b);
        if (va < 0 || vb < 0) {
            throw new Exception("Vértice no existe");
        }
        return matAd[va][vb] == 1;
    }

    public int numeroDeVertices() {
        return numVerts;
    }

    public void mostrarMatriz() {
        try {
            System.out.print("  | ");
            for (int i = 0; i < numVerts; i++) {
                System.out.print(verts[i].nomVertice() + " ");
            }
            System.out.println();
            System.out.print("--");
            for (int i = 0; i < numVerts; i++) {
                System.out.print("--");
            }
            System.out.println();
            for (int i = 0; i < numVerts; i++) {
                System.out.print(verts[i].nomVertice() + " | ");
                for (int j = 0; j < numVerts; j++) {
                    System.out.print(matAd[i][j] + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("MATRIZ VACIA");
        }
    }

    public int[][] obtenerMatAd() {
        return matAd;
    }

    public Vertice obtenerVertice(int v) {
        return verts[v];
    }
}
