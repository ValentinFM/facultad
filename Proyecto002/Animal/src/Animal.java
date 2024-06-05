public class Animal {
    public static void main(String[] args) throws Exception {
        Perro perro = new Perro("Laika", "Border Collie", "Negro & Blanco", true);
        perro.saludar();
        perro.alimentar(3);
        perro.alimentar(15);
    }
}