import Material.Genero;
import Material.Material;
import Material.Ebook;
import Material.Libro;
import Material.Revista;
import Material.EstadoPrestamo;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;

public class GestionBiblioteca {

    private final Biblioteca biblioteca = new Biblioteca();


    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Material crearMaterial() {

        Scanner scan = new Scanner(System.in);
        int eleccion;


        System.out.println("Va a ingresar un material a la lista de materiales");

        System.out.println("Que tipo de material le gustaria ingresar?");

        System.out.println("1-Ebook");
        System.out.println("2-Libro");
        System.out.println("3-Revista");
        System.out.println("0-SALIR");

        do {
            eleccion = scan.nextInt();
        } while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 0);

        System.out.println("Ingrese el titulo");
        String titulo = scan.nextLine();
        System.out.println("Ingrese el autor");
        String autor = scan.nextLine();
        System.out.println("Ingrese el año");
        int anio = scan.nextInt();


        Genero g = Genero.generarGenero();


        switch (eleccion) {

            case 1:

                System.out.println("Ingrese la url");
                String URL = scan.nextLine();
                return new Ebook(autor, titulo, anio, g, URL);

            case 2:
                System.out.println("Ingrese la editorial");
                String editorial = scan.nextLine();
                return new Libro(autor, titulo, anio, g, editorial);

            case 3:
                System.out.println("Ingrese el universo");
                String universo = scan.nextLine();
                return new Revista(autor, titulo, anio, g, universo);

            case 0:
                System.out.println("Adios!");
                return null;

        }
        return null;
    }

    public void ingresarMaterialAbiblioteca() {

        biblioteca.agregar(crearMaterial());

    }

    public void eliminarMaterialDeBiblioteca() {

        Scanner scan = new Scanner(System.in);
        int eleccion;

        System.out.println("Se le va a dar una lista de todos los materiales, ingrese el id del material que quiere eliminar");

        biblioteca.mostrarMateriales();

        System.out.println("Que material elige?");
        eleccion = scan.nextInt();

        for (Material m : biblioteca.getMateriales()) {
            if (m.getId() == eleccion) {
                biblioteca.eliminar(m);
            }
        }


    }


    public void editarMaterialDeBiblioteca() {

        int eleccion;
        Scanner scan = new Scanner(System.in);

        System.out.println("Se le otorgara la lista de materiales, indique el id del cual quier editar, se creara otro nuevo");

        biblioteca.mostrarMateriales();


        System.out.println("Cual quiere eliminar (ID)");
        eleccion = scan.nextInt();

        for (int i = 0; i < biblioteca.getMateriales().size(); i++) {

            if (biblioteca.getMateriales().get(i).getId() == eleccion) {

                biblioteca.getMateriales().set(i, crearMaterial());

            }

        }

    }

    public void cambiarEstadoPrestamo(Material m){

        m.setEstado(EstadoPrestamo.CambiarEstadoPrestamo(m.getEstado()));

    }


    public void ordenarListaPorTitulo(){

        Collections.sort(biblioteca.getMateriales());

    }


    public void mostrarSoloEbooks(){

        for(Material m : biblioteca.getMateriales()){

            if(m instanceof Ebook){
                System.out.println(m.toString());
            }

        }

    }


}
