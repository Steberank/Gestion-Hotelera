public class Personal {
    private int dni;
    private int nombre;
    private int apellido;
    private int telefono;
    private int salario; //POR MES
    private Puesto rol;

    public Personal() {
    }

    public Personal(int dni, int nombre, int apellido, int telefono, int salario, Puesto rol) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.salario = salario;
        this.rol = rol;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Puesto getRol() {
        return rol;
    }

    public void setRol(Puesto rol) {
        this.rol = rol;
    }
}
