package Material;

import java.util.Scanner;

public enum Genero {

    Drama,
    Novela,
    Romance,
    Terror;


    public static Genero generarGenero(){

        Scanner scan = new Scanner(System.in);
        int eleccion;

        System.out.println("Ingrese el tipo de genero");
        System.out.println("Si no ingresa un numero especificado sera Drama");
        System.out.println("1-Drama");
        System.out.println("2-Novela");
        System.out.println("3-Romance");
        System.out.println("4-Terror");

        eleccion = scan.nextInt();

        return switch (eleccion) {
            case 1 -> Genero.Drama;
            case 2 -> Genero.Novela;
            case 3 -> Genero.Romance;
            case 4 -> Genero.Terror;
            default -> Genero.Drama;
        };

    }

}
