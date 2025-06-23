import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear hotel
        Hotel hotel = new Hotel("Hotel Paraíso");

        // Crear cliente
        Cliente cliente1 = new Cliente("Carlos Pérez", "0102030405");

        // Crear reserva
        Reserva reserva1 = new Reserva(cliente1, 101, LocalDate.of(2025, 6, 25), LocalDate.of(2025, 6, 28));

        // Agregar reserva al hotel
        hotel.agregarReserva(reserva1);

        // Mostrar todas las reservas
        hotel.mostrarReservas();
    }
}
