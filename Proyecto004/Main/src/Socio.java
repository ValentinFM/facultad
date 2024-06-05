import java.time.LocalDate;

public class Socio {
    //atributos
    public String nombre;
    private int codigo;
    private int edad;
    private LocalDate fecha;
    //constructor
    public Socio(String nombre, int codigo, int edad, int dia, int mes, int año) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = LocalDate.of(año, mes, dia);
    }
    //getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

};
