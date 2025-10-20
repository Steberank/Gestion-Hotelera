package Material;

public class Libro extends Material{

    private String editorial;

    public Libro(String autor, String titulo, int anio, Genero genero, String editorial) {
        super(autor, titulo, anio, genero);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return super.toString()+"Material.Libro{" +
                "editorial='" + editorial + '\'' +
                '}';
    }


}
