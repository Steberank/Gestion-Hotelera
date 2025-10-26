import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int id;
    private List<TipoCama> camas = new ArrayList<>();
    private int cupoTotal = calcularCupoTotal();
    private EstadoDeHabitacion estado;

    public Habitacion() {
    }

    public Habitacion(int id, List<TipoCama> camas, int cupoTotal, EstadoDeHabitacion estado) {
        this.id = id;
        this.camas = camas;
        this.cupoTotal = calcularCupoTotal();
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<TipoCama> getCamas() {
        return camas;
    }

    public void setCamas(List<TipoCama> camas) {
        this.camas = camas;
        this.cupoTotal = calcularCupoTotal();
    }

    public int getCupoTotal() {
        return cupoTotal;
    }


    public EstadoDeHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeHabitacion estado) {
        this.estado = estado;
    }

    public int calcularCupoTotal() {
        if(camas.isEmpty()){
            return 0;
        }
        int total = 0;
        for (TipoCama cama : camas) {
            switch (cama) {
                case UNA_PLAZA -> total += 1;
                case DOS_PLAZAS_MATRIMONIAL, DOS_PLAZAS_CUCHETA -> total += 2;
            }
        }
        return total;
    }
}
