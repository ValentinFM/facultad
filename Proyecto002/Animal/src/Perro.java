public class Perro {
    String nombre;
    String color;
    String raza;
    boolean estadoHambre;

    // atributos
    // constructores
    // metodos
    public Perro(String nombre, String raza, String color, boolean estadoHambre)// constructor
    {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.estadoHambre = estadoHambre;
    }

    public void saludar() {// metodo
        System.out.println("¡Hola!\nMi nombre es: " + this.nombre + ". \nMi raza es: " + this.raza
                + ".\nMis colores son: " + this.color + ".\n");
        if (estadoHambre) {
            System.out.println("Laika tiene hambre");
        } else {
            System.out.println("Laika no tiene hambre");
        }
    }

    public void alimentar(int cantidad) {// metodo
        if (cantidad < 10) {
            System.out.println("Laika sigue con hambre");
        } else {
            System.out.println("Laika esta llena");
            this.estadoHambre = false;
        }
    }
}
