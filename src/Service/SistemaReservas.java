package Service;
import java.util.ArrayList;
import Model.Reserva;

public class SistemaReservas {
    private ArrayList<Reserva> reservas;

    public SistemaReservas() {
        reservas = new ArrayList<>();
    }

    public void agregarReserva(Reserva r) {
        reservas.add(r);
        System.out.println("Reserva agregada correctamente (ID: " + r.getId() + ")");
    }

    public void eliminarReserva(int id) throws Exception {
        boolean encontrada = false;

        for (Reserva r : reservas) {
            if (r.getId() == id) {
                reservas.remove(r);
                System.out.println("Reserva eliminada (ID: " + id + ")");
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            throw new Exception("No existe una reserva con el ID: " + id);
        }
    }

    public void listarReservas() {
        System.out.println("\n--- LISTADO DE RESERVAS ---");
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas registradas.");
        } else {
            for (Reserva r : reservas) {
                r.mostrarInfo();
            }
        }
        System.out.println("----------------------------\n");
    }

    public int contarReservas() {
        return reservas.size();
    }
}
