package Material;

public class Revista extends Material{

    private String universo;

    public Revista(String autor, String titulo, int anio, Genero genero, String universo) {
        super(autor, titulo, anio, genero);
        this.universo = universo;
    }


    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }
}
