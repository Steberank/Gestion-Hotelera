package Clases;

import java.time.LocalDate;

public class RegistroDeLimpieza {
    private Personal mucama;
    private LocalDate fecha;
    private Habitacion habitacion;

    public RegistroDeLimpieza(Personal mucama, LocalDate fecha, Habitacion habitacion) {
        this.mucama = mucama;
        this.fecha = fecha;
        this.habitacion = habitacion;
    }

    public Personal getMucama() {
        return mucama;
    }

    public void setMucama(Personal mucama) {
        this.mucama = mucama;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
