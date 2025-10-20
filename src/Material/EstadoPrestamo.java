package Material;

public enum EstadoPrestamo {

    PRESTADO,
    DISPONIBLE;

    public static EstadoPrestamo CambiarEstadoPrestamo(EstadoPrestamo e){

        if(e.equals(EstadoPrestamo.PRESTADO)){return EstadoPrestamo.DISPONIBLE;}
        else{return EstadoPrestamo.PRESTADO;}

    }



}
