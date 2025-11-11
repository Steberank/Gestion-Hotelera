package Sesion;

public class Usuario {
    private int id;
    private String nombre;
    private String contraseña;
    private boolean Modificar_habitaciones = false;
    private boolean Modificar_reservas = false;
    private boolean Modificar_registroLimpieza = false;

    public Usuario(int id, String nombre, String contraseña, boolean modificar_habitaciones, boolean modificar_reservas,
            boolean modificar_registroLimpieza) {
        this.id = id;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.Modificar_habitaciones = modificar_habitaciones;
        this.Modificar_reservas = modificar_reservas;
        this.Modificar_registroLimpieza = modificar_registroLimpieza;
    }
}
