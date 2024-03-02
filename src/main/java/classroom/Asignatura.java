package classroom;

public class Asignatura {

    public String nombre;
    String n = nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {   
        this("Sin nombre",Tipo.FUNDAMENTACION,0);
    
    }
    public Asignatura(String nombre,Tipo tipo,int codigo){
        this.codigoExterno = codigo;
        this.codigoInterno = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public Asignatura(int codigoInterno,Tipo tipo) {
        this("Sin nombre", codigoInterno, codigoInterno,tipo);
    }

    // public Asignatura(Tipo tipo,int codigoExterno) {
    //     this("Sin nombre", 0, codigoExterno,tipo);
    // }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void codigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void codigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarDatos(int codigoInterno){
        this.codigoExterno = codigoInterno;
        this.codigoInterno = codigoInterno;
        
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
