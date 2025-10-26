import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private String direccion;
    private LocalDate inicioTemporada;
    List<Habitacion> habitaciones = new ArrayList<>();
    List<Reserva> reservas = new ArrayList<>();
    List<Personal> personal = new ArrayList<>();
    List<Temporada> historialTemporadas = new ArrayList<>();

    public Hotel(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Hotel(String nombre, String direccion, LocalDate inicioTemporada, List<Habitacion> habitaciones, List<Reserva> reservas, List<Personal> personal, List<Temporada> historialTemporadas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inicioTemporada = inicioTemporada;
        this.habitaciones = habitaciones;
        this.reservas = reservas;
        this.personal = personal;
        this.historialTemporadas = historialTemporadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getInicioTemporada() {
        return inicioTemporada;
    }

    public void setInicioTemporada(LocalDate inicioTemporada) {
        this.inicioTemporada = inicioTemporada;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }

    public List<Temporada> getHistorialTemporadas() {
        return historialTemporadas;
    }

    public void setHistorialTemporadas(List<Temporada> historialTemporadas) {
        this.historialTemporadas = historialTemporadas;
    }
}
