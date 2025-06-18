package modelo;

public class Reserva {
    private Empleado empleado;
    private Sala sala;
    private String hora;


    public Reserva(Empleado empleado, Sala sala, String hora){
        this.empleado = empleado;
        this.sala = sala;
        this.hora = hora;
        sala.ocupar();
    }

    public Empleado getEmpleado(){
        return empleado;
    }

    public Sala getSala(){
        return sala;
    }

    public String getHora(){
        return hora;
    }

    public void mostrarResumen(){
        System.out.println("=== RESERVA ===");
        empleado.mostrarDatos();
        System.out.println("Sala: " + sala.getNombre());
        System.out.println("Hora: " + hora);
    }

}
