import Material.Material;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Material> materiales = new ArrayList<>();

    public void agregar(Material m){
        materiales.add(m);
    }

    public void eliminar(Material m){
        materiales.remove(m);
    }

    public void edit(int indice, Material m){
        materiales.set(indice,m);
    }

    public void mostrarMateriales(){
        for(Material m : materiales){
            System.out.println(m.toString());
        }
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }


}
