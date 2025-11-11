package Clases;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Reserva {
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Habitacion habitacionReservada;
    private EstadoDeReserva estadoDeReserva; //PENDIENTE, SEÑADO O ABONADO
    private double monto;
    private int cantidadHuespedes; //INCLUYE A "CLIENTE" (EL QUE ABONA)
    private Cliente cliente;
    private String comprobante;
    private String servicios;

    public Reserva() {
    }

    public Reserva(LocalDate checkIn, LocalDate checkOut, Habitacion habitacionReservada, EstadoDeReserva estadoDeReserva, double monto, int cantidadHuespedes, Cliente cliente, String comprobante, String servicios) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.habitacionReservada = habitacionReservada;
        this.estadoDeReserva = estadoDeReserva;
        this.monto = monto;
        this.cantidadHuespedes = cantidadHuespedes;
        this.cliente = cliente;
        this.comprobante = comprobante;
        this.servicios = servicios;
    }

    public void mostrarReserva() {
        System.out.println("========== RESERVA ==========");
        System.out.println("Cliente: " + cliente.getNombres() + " " + cliente.getApellidos() + " (DNI: " + cliente.getDni() + ")");
        System.out.println("Check-in: " + checkIn);
        System.out.println("Check-out: " + checkOut);
        System.out.println("Estado: " + estadoDeReserva);
        System.out.println("Monto dejado: " + monto);
        System.out.println("Cantidad de huéspedes: " + cantidadHuespedes);
        System.out.println("Comprobante: " + comprobante);
        System.out.println("Servicios: " + servicios);
        System.out.println("Habitacion reservada:" );
        habitacionReservada.mostrarHabitacion();

        System.out.println("=============================");
    }

}
