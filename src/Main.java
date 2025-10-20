import Material.Material;
import Material.Revista;
import Material.Genero;
import Material.EstadoPrestamo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Material m = new Revista("autor","titulo",213, Genero.Romance,"universe");

        System.out.println(m.toString());

        m.setEstado(EstadoPrestamo.CambiarEstadoPrestamo(m.getEstado()));

        System.out.println(m.toString());

        System.out.println("Cambio hecho por Stephaa");


    }
}