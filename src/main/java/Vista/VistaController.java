package Vista;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VistaController {
    @FXML
    private void abrirConfiguracion() throws Exception {
        Stage configStage = new Stage();
        configStage.setTitle("Configuración");
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Configuracion.fxml"));
        Scene scene = new Scene(loader.load(), 800, 600);
        configStage.setScene(scene);
        configStage.show();
    }
}

