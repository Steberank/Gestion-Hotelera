public class Cliente {
    private int dni;
    private int nombre;
    private int apellido;
    private int edad;
    private int numeroTelefono;

    public Cliente() {
    }

    public Cliente(int dni, int nombre, int apellido, int edad, int numeroTelefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroTelefono = numeroTelefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getApellido() {
        return apellido;
    }

    public void setApellido(int apellido) {
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
