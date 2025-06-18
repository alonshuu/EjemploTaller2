package modelo;

public class Empleado extends Persona {
    public Empleado(String nombre, String rut, String correo) {
        super(nombre, rut, correo);
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + getNombre() + "Rut: " + getRut() + "Correo: " + getCorreo());
    }

}
