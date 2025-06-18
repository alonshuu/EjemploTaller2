package modelo;

public class Persona {
    private String nombre;
    private String rut;
    private String correo;

    public Persona(String nombre, String rut, String correo){
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;

    }

    public String getNombre(){
        return nombre;
    }

    public String getRut(){
        return rut;
    }

    public String getCorreo(){
        return correo;
    }


}
