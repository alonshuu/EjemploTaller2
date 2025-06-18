package vista;

import modelo.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {
    private Scanner scanner = new Scanner(System.in);
    private List<Sala> salas = new ArrayList<>();


    public Consola() {
        salas.add(new Sala("Sala norte",10));
        salas.add(new Sala("Sala sur",6));
        salas.add(new Sala("Sala este",8));
    }

    public void iniciarReserva() {
        System.out.println("==== BIENVENIDO AL SISTEMA DE RESERVAS ====");

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese RUT del empleado: ");
        String rut = scanner.nextLine();
        System.out.print("Ingrese correo del empleado: ");
        String correo = scanner.nextLine();

        Empleado empleado = new Empleado(nombre,rut,correo);

        System.out.println("\n Salas disponibles");
        int index = 1;
        for (Sala sala : salas) {
            System.out.println(index + ".");
            sala.mostrarInfo();
            index++;
        }


        System.out.print("Seleccione una sala (número): ");
        int seleccion = Integer.parseInt(scanner.nextLine());

        if (seleccion < 1 || seleccion > salas.size()) {
            System.out.println("Selección inválida.");
            return;
        }

        Sala salaseleccionada = salas.get(seleccion - 1);

        if (!salaseleccionada.estaDisponible()) {
            System.out.println("La sala ya está ocuapda, intenta con otra");
            return;
        }

        System.out.println("Ingrese la hora de la reserva (ej 14:00): ");
        String hora = scanner.nextLine();

        Reserva reserva = new Reserva(empleado,salaseleccionada,hora);

        System.out.println("\n Reserva realizada con éxito!");
        reserva.mostrarResumen();





    }

}
