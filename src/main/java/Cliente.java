import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Persona {
    private String informacionExtra;

    public Cliente(int dni, String nombres, String apellidos, LocalDate fecha_nacimiento, int telefono,
            String informacionExtra) {
        super(dni, nombres, apellidos, fecha_nacimiento, telefono);
        this.informacionExtra = informacionExtra;
    }

    public Cliente(String informacionExtra) {
        this.informacionExtra = informacionExtra;
    }

    public String getInformacionExtra() {
        return informacionExtra;
    }

    public void setInformacionExtra(String informacionExtra) {
        this.informacionExtra = informacionExtra;
    }
}
