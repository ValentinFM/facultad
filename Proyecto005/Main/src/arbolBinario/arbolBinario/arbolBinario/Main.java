package arbolBinario;

import ArbolBinarioOrdenado.ArbolBinarioBusqueda;
import pilaVector.PilaVector;

public class Main {
    public static void main(String[] args) throws Exception {
        Nodo a1, a2, a;
        PilaVector pila = new PilaVector();

        a1 = ArbolBinario.nuevoArbol(null,"Maria",null);
        a2 = ArbolBinario.nuevoArbol(null,"Rodrigo",null);
        a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
        pila.insertar(a);

        a1 = ArbolBinario.nuevoArbol(null,"Anyora",null);
        a2 = ArbolBinario.nuevoArbol(null,"Abel",null);
        a = ArbolBinario.nuevoArbol(a1,"M Jesus",a2);
        pila.insertar(a);
        a2 = (Nodo) pila.quitar();
        a1 = (Nodo) pila.quitar();
        a = ArbolBinario.nuevoArbol(a1,"Esperanza",a2);
        System.out.println("Arbol: " + a.dato);

        ArbolBinarioBusqueda arbolBinario = new ArbolBinarioBusqueda();
        




    }
}