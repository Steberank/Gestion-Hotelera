import java.time.LocalDate;

public class Personal extends Persona {
    private String email;
    private Puesto rol;
    private double salarioPorHora;
    private LocalDate fechaDeIngreso;
    private LocalDate finDeContrato;

    public Personal(int dni, String nombres, String apellidos, LocalDate fecha_nacimiento, String email, Puesto rol,
            double salarioPorHora, LocalDate fechaDeIngreso, LocalDate finDeContrato, int telefono) {
        super(dni, nombres, apellidos, fecha_nacimiento, telefono);
        this.email = email;
        this.rol = rol;
        this.salarioPorHora = salarioPorHora;
        this.fechaDeIngreso = fechaDeIngreso;
        this.finDeContrato = finDeContrato;
    }

    public Personal() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Puesto getRol() {
        return rol;
    }

    public void setRol(Puesto rol) {
        this.rol = rol;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public LocalDate getFinDeContrato() {
        return finDeContrato;
    }

    public void setFinDeContrato(LocalDate finDeContrato) {
        this.finDeContrato = finDeContrato;
    }
}
