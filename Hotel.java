import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Reserva> reservas;

    // Constructor
    public Hotel(String nombre) {
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
    }

    // Método para agregar una reserva
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva agregada exitosamente.");
    }

    // Mostrar todas las reservas
    public void mostrarReservas() {
        System.out.println("Reservas en " + nombre + ":");
        for (Reserva r : reservas) {
            r.mostrarReserva();
            System.out.println("-----------");
        }
    }
}
