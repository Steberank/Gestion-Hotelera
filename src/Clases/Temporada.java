package Clases;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.*;

/*
ESTA CLASE SOLO SIRVE COMO HISTORIAL DE TEMPORADAS PASADAS,UNICAMENTE SE INSTANCIARA ESTA CLASE CUANDO LA TEMPORADA ACTUAL SE CIERRE
 */
public class Temporada {
    private LocalDate incioTemporada;
    private LocalDate finTemporada;
    private List<Reserva> historialDeReservas;
    private Set<Personal> personal;

    public Temporada(LocalDate incioTemporada, LocalDate finTemporada, List<Reserva> historialDeReservas, Set<Personal> personal) {
        this.incioTemporada = incioTemporada;
        this.finTemporada = finTemporada;
        this.historialDeReservas = historialDeReservas;
        this.personal = personal;
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
