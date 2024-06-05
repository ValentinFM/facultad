package CasasAlcarria;


public class CasaRural {
    public String codigo;
    private String poblacion;
    private String direccion;
    public int numHabitacion;
    private double precio;
    boolean esAlta;

    public CasaRural(String codigo, String poblacion, String direccion, int numHabitacion, double precio, boolean esAlta) {
        this.codigo=codigo;
        this.poblacion=poblacion;
        this.direccion=direccion;
        this.numHabitacion=numHabitacion;
        this.precio=precio;
        this.esAlta=esAlta;
    }


    public String Muestra() {
        return("\n Codigo: " + codigo+" Población: " + poblacion+" Dirección: " + direccion+" Precio por día: " + precio);
    }

}