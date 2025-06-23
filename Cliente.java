public class Cliente {
    private String nombre;
    private String cedula;

    // Constructor
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    // Método para mostrar información del cliente
    public void mostrarInfo() {
        System.out.println("Cliente: " + nombre + ", Cédula: " + cedula);
    }
}
