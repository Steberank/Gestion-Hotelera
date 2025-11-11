import Vista.Aplicacion;
import java.util.List;
import java.util.ArrayList;
import Sesion.Usuario;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario(1, "admin", "admin123", true, true, true));
        usuarios.add(new Usuario(2, "recepcionista", "recepcion123", false, true, true));
        usuarios.add(new Usuario(3, "otrosEmpleados", "empleado123", false, false, true));

        Aplicacion.launch(Aplicacion.class, args);
    }
}
