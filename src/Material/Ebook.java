package Material;

public class Ebook extends Material{

    private String url;

    public Ebook(String autor, String titulo, int anio, Genero genero, String url) {
        super(autor, titulo, anio, genero);
        this.url = url;
    }


    @Override
    public String toString() {
        return super.toString()+"Material.Ebook{" +
                "url='" + url + '\'' +
                '}';
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}
