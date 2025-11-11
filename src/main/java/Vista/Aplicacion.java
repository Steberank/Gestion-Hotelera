package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;
import java.util.ArrayList;
import Sesion.Usuario;

public class Aplicacion extends Application {
    @Override
    public void start(Stage stage) {
        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario(1, "admin", "admin123", true, true, true));
        usuarios.add(new Usuario(2, "recepcionista", "recepcion123", false, true, true));
        usuarios.add(new Usuario(3, "otrosEmpleados", "empleado123", false, false, true));

        Label titulo = new Label("Gestión de Hotel");
        Label info = new Label("Usuarios cargados: " + usuarios.size());

        VBox root = new VBox(10);
        root.getChildren().addAll(titulo, info);

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Hotel");
        stage.show();
    }
}

