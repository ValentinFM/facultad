public class Main {
    public static void main(String[] args) {
        //crea la tabla de dispersión
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();

        //crear socios
        Socio socio1 = new Socio("Valentin", 12345, 30, 15, 5, 1994);
        Socio socio2 = new Socio("Martin", 67890, 25, 20, 7, 1998);
        Socio socio3 = new Socio("Carlos", 13579, 40, 10, 9, 1983);

        //inserta los socios en la tabla
        tabla.insertar(socio1);
        tabla.insertar(socio2);
        tabla.insertar(socio3);

        //busca los socios en la tabla
        if (tabla.buscar(12345) != null) {
            System.out.println("Buscando al socio con código 12345: Encontrado");
        } else {
            System.out.println("Buscando al socio con código 12345: No encontrado");
        }

        if (tabla.buscar(67890) != null) {
            System.out.println("Buscando al socio con código 67890: Encontrado");
        } else {
            System.out.println("Buscando al socio con código 67890: No encontrado");
        }

        if (tabla.buscar(13579) != null) {
            System.out.println("Buscando al socio con código 13579: Encontrado");
        } else {
            System.out.println("Buscando al socio con código 13579: No encontrado");
        }

        if (tabla.buscar(11111) != null) {
            System.out.println("Buscando al socio con código 11111: Encontrado");
        } else {
            System.out.println("Buscando al socio con código 11111: No encontrado");
        }

        //eliminar un socio
        System.out.println("Eliminando al socio con código 67890.");
        tabla.eliminar(67890);

        //buscar de nuevo después de eliminar
        if (tabla.buscar(67890) != null) {
            System.out.println("Buscando al socio con código 67890 después de eliminar: Encontrado");
        } else {
            System.out.println("Buscando al socio con código 67890 después de eliminar: No encontrado");
        }

        //mostrar el número de elementos en la tabla
        System.out.println("Número de elementos en la tabla: " + tabla.numElementos);
    }
}
