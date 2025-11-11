package Vista;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Vista.fxml"));
        Scene scene = new Scene(loader.load(), 640, 400);
        stage.setScene(scene);
        stage.setTitle("Hotel");
        stage.show();
    }
}
