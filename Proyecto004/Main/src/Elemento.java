public class Elemento {
    public static final String Socio = null;//no entiendo esto
    Socio p;//entiendo que es un socio llamado p
    Elemento sgte;
    public Object socio;//ni esto
    //constructor
    public Elemento(Socio p) {
        this.p = p;
        this.sgte = null;
    }
    //getter
    public Socio getSocio() {
        return p;
    }
};