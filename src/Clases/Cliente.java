package Clases;

import java.util.Scanner;

public class Cliente {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroTelefono;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, int edad, int numeroTelefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }


    public static Cliente crearCliente(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el dni");
        int dni = sc.nextInt();

        System.out.println("Ingrese el nombre");
        String nombre= sc.nextLine();

        System.out.println("Ingrese el apellido");
        String apellido = sc.nextLine();

        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        while (edad < 18){
            System.out.println("Edad no valida");
            edad = sc.nextInt();
        }

        System.out.println("Ingrese numero de telefono");
        int telefono = sc.nextInt();

        return new Cliente(dni,nombre,apellido,edad,telefono);

    }

    public void mostrarCliente() {
        System.out.println("----- Datos del Cliente -----");
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroTelefono);
        System.out.println("-----------------------------");
    }



    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
}
