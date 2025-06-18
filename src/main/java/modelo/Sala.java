package modelo;

public class Sala {
    private String nombre;
    private int capacidad;
    private boolean disponible;


    public Sala(String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true; // x defecto deberia estar disponible
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void ocupar(){
        this.disponible = false;
    }

    public void liberar(){
        this.disponible = true;
    }

    public void mostrarInfo(){
        System.out.println("Sala: "+ nombre + " (Capacidad: " + capacidad + "- Disponible : " + disponible);
    }




}
