package Clases;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

public class Temporada {
    private LocalDate incioTemporada;
    private LocalDate finTemporada;
    private List<Reserva> historialDeReservas = new ArrayList<>();
    private Set<Personal> personal = new HashSet<>();

    public Temporada(LocalDate incioTemporada, LocalDate finTemporada, List<Reserva> historialDeReservas, Set<Personal> personal) {
        this.incioTemporada = incioTemporada;
        this.finTemporada = finTemporada;
        this.historialDeReservas = historialDeReservas;
        this.personal = personal;
    }

    public void addReserva(Reserva r){

        historialDeReservas.add(r);

    }


    public void showHistorialReservas(){
        System.out.println("Historial de reservas");
        for(int i = 0; i < historialDeReservas.size(); i++){
            System.out.println("RESERVA NUMERO " + i);
            historialDeReservas.get(i).mostrarReserva();
        }
    }


    public LocalDate getIncioTemporada() {
        return incioTemporada;
    }

    public LocalDate getFinTemporada() {
        return finTemporada;
    }

    public List<Reserva> getHistorialDeReservas() {
        return historialDeReservas;
    }

    public Set<Personal> getPersonal() {
        return personal;
    }
}
