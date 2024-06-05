// crear un medio de transporte publico

public class Main {
  public static void main(String[] args) {
    Transporte auto = new Transporte();
    auto.anio = 2024;
    auto.color = "Blanco";
    auto.kilometraje = 52300;
    auto.marca = "Renault";
    auto.modelo = "Fluence";
    auto.patente = "AA000AA";
    auto.cantidadPuertas = 5;
    System.out.println("El auto es un " + auto.marca + " " + auto.modelo + ", de color " + auto.color + ", con patente " + auto.patente + " y " + auto.cantidadPuertas + " puertas. " + "Tiene " + auto.kilometraje + " kilometros");
  }
}