import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Reserva {
    private LocalDate checkIn;
    private LocalDate checkOut;
    Set<Habitacion> habitacionesReservadas = new HashSet<>();
    private EstadoDeReserva estadoDeReserva; //PENDIENTE, SEÑADO O ABONADO
    private int cantidadHuespedes; //INCLUYE A "CLIENTE" (EL QUE ABONA)
    private Cliente cliente;
    private String comprobante;
    private String servicios;

    public Reserva() {
    }

    public Reserva(LocalDate checkIn, LocalDate checkOut, EstadoDeReserva estadoDeReserva, int cantidadHuespedes, Cliente cliente, String comprobante, String servicios) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.estadoDeReserva = estadoDeReserva;
        this.cantidadHuespedes = cantidadHuespedes;
        this.cliente = cliente;
        this.comprobante = comprobante;
        this.servicios = servicios;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public EstadoDeReserva getEstado() {
        return estadoDeReserva;
    }

    public void setEstado(EstadoDeReserva estadoDeReserva) {
        this.estadoDeReserva = estadoDeReserva;
    }

    public int getCantidadHuespedes() {
        return cantidadHuespedes;
    }

    public void setCantidadHuespedes(int cantidadHuespedes) {
        this.cantidadHuespedes = cantidadHuespedes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getComprobante() {
        return comprobante;
    }

    public void setComprobante(String comprobante) {
        this.comprobante = comprobante;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }
}
