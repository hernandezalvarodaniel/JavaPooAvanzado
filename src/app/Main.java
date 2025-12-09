package app;

import Model.Reserva;
import Service.SistemaReservas;

public class Main {

    public static void main(String[] args) {

        SistemaReservas sistema = new SistemaReservas();

        // Crear reservas
        Reserva r1 = new Reserva(1, "Alvaro Hernández", "2025-01-12", 2);
        Reserva r2 = new Reserva(2, "Ana Perez", "2025-07-12", 3);

        sistema.agregarReserva(r1);
        sistema.agregarReserva(r2);

        // Uso de setters
        System.out.println("\nModificando la reserva 1...");
        r1.setDuracionHoras(4);

        // Listar reservas
        sistema.listarReservas();

        // Mostrar total
        System.out.println("Total de reservas: " + sistema.contarReservas());

        // Eliminar usando try/catch
        try {
            sistema.eliminarReserva(2); // existe
            sistema.eliminarReserva(5); // NO existe (provoca excepción)
        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }

        // Listar de nuevo
        sistema.listarReservas();

        System.out.println("Total final de reservas: " + sistema.contarReservas());
    }
}
