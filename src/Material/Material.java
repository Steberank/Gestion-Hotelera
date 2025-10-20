package Material;

import java.util.Comparator;

public abstract class Material implements Comparable<Material> {

    private EstadoPrestamo estado;
    private int id;
    private static int autoincremental =1;
    private String autor;
    private String titulo;
    private int anio;
    private Genero genero;

    public Material(String autor, String titulo, int anio, Genero genero) {
        this.id = autoincremental++;
        this.estado = EstadoPrestamo.DISPONIBLE;
        this.autor = autor;
        this.titulo = titulo;
        this.anio = anio;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Material.Material{" +
                "estado=" + estado +
                ", id=" + id +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", genero=" + genero +
                '}';
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }

    public void setEstado(EstadoPrestamo estado) {
        this.estado = estado;
    }

    @Override
    public int compareTo(Material o) {
        return this.titulo.compareTo(o.titulo);
    }


}
