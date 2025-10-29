package Clases;

import com.sun.security.jgss.GSSUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public Reserva crearReserva() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido, va a crear una reserva");

        int idH;
        LocalDate checkIn;
        LocalDate checkOut;
        do {
            System.out.print("Ingrese fecha de check-in (AAAA-MM-DD): ");
            checkIn = LocalDate.parse(sc.nextLine());

            System.out.print("Ingrese fecha de check-out (AAAA-MM-DD): ");
            checkOut = LocalDate.parse(sc.nextLine());

            System.out.println("Que habitacion va a reservar? ");
            idH = sc.nextInt();
            while (buscarHabitacion(idH) == null) {
                System.out.println("Habitacion no encontrada");
                idH = sc.nextInt();
            }
        } while (!verificacionReserva(idH, checkIn, checkOut));

        System.out.println("Habitacion reservada: ");
        buscarHabitacion(idH).mostrarHabitacion();


        System.out.println("Va a ingresar el cliente");
        Cliente cliente = Cliente.crearCliente();
        cliente.mostrarCliente();;


        System.out.println("Cual es el monto dejado?");
        float monto = sc.nextFloat();

        String comprobante = generarComprobante(cliente.getNombre(), monto);

        EstadoDeReserva e;

        if (monto == 1000) e = EstadoDeReserva.ABONADO;
        else if (monto > 0) e = EstadoDeReserva.SENIADO;
        else e = EstadoDeReserva.PENDIENTE;

        System.out.println("Cuantas personas se hospedaran?");
        int cantidadHuespedes = sc.nextInt();

        System.out.println("Que servicios le gustaria que le brindemos? desayuno/almuerzo/etc");
        String servicios = sc.nextLine();

        System.out.println("RESERVA CREADA: ");
       Reserva r = new Reserva(checkIn,checkOut,e,cantidadHuespedes,cliente,comprobante,servicios);
        r.mostrarReserva();
        return r;

    }

    public boolean verificacionReserva(int idH, LocalDate CI, LocalDate CO) {
        if (CI.isAfter(CO)) {
            for (Reserva r : reservas) {

                if (r.getHabitacionReservada().getId() == idH) {
                    {

                        //DOS SITUACIONES DE SOLAPAMIENTO DE FECHAS DE RESERVA

                        //1 CHECK IN DENTRO DEL INTERVALO DE RESERVA ANTERIOR
                        if (CI.isAfter(r.getCheckIn()) && CI.isBefore(r.getCheckOut())) {
                            System.out.println("RESERVA NO VALIDA");
                            return false;
                        }

                        //2 CHECK OUT DENTRO DEL INTERVALO DE RESERVA ANTERIOR
                        if (CO.isBefore(r.getCheckOut()) && CO.isAfter(r.getCheckIn())) {
                            System.out.println("RESERVA NO VALIDA");
                            return false;
                        }
                        //CON ESTAS DOS VERIFICACIONES ALCANZA PARA VERIFICAR SI EL INTERVALO
                        //DE LA NUEVA RESERVA ESTA DENTRO DEL INTERVALO DE LA ANTERIOR RESERVA

                        if (CO.isBefore(r.getCheckIn())) {
                            System.out.println("RESERVA VALIDA");
                            return true;
                        }

                        if (CI.isAfter(r.getCheckOut())) {
                            System.out.println("RESERVA VALIDA");
                            return true;
                        }

                    }


                }


            }

        }else {
            System.out.println("Fechas invalidas");
            return false;
        }

        return false;
    }

    public Habitacion buscarHabitacion(int id) {

        for (Habitacion h : habitaciones) {
            if (h.getId() == id) return h;
        }

        return null;

    }

    public String generarComprobante(String nombreC, float monto){
        return nombreC + "Le transfirio " + monto;
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
