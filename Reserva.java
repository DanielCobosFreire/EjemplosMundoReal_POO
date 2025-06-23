import java.time.LocalDate;

public class Reserva {
    private Cliente cliente;
    private int numeroHabitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;

    // Constructor
    public Reserva(Cliente cliente, int numeroHabitacion, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    // Método para mostrar información de la reserva
    public void mostrarReserva() {
        System.out.println("Reserva para: " + cliente.getNombre());
        System.out.println("Habitación N°: " + numeroHabitacion);
        System.out.println("Desde: " + fechaEntrada + " hasta " + fechaSalida);
    }
}
