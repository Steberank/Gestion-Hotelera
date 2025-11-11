package Vista;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import java.net.URL;
import java.util.ResourceBundle;

public class ConfiguracionController implements Initializable {
    @FXML
    private TextField nombreHotel;

    @FXML
    private TextField direccionHotel;

    @FXML
    private TableView<HabitacionTableModel> tablaHabitaciones;

    @FXML
    private TableColumn<HabitacionTableModel, String> columnaId;

    @FXML
    private TableColumn<HabitacionTableModel, String> columnaNombre;

    @FXML
    private TableColumn<HabitacionTableModel, String> columnaUnaPlaza;

    @FXML
    private TableColumn<HabitacionTableModel, String> columnaMatrimoniales;

    @FXML
    private TableColumn<HabitacionTableModel, String> columnaCucheta;

    private ObservableList<HabitacionTableModel> habitacionesData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tablaHabitaciones.setEditable(true);

        columnaId.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnaId.setCellFactory(TextFieldTableCell.forTableColumn());
        columnaId.setEditable(true);

        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columnaNombre.setCellFactory(TextFieldTableCell.forTableColumn());
        columnaNombre.setEditable(true);

        columnaUnaPlaza.setCellValueFactory(new PropertyValueFactory<>("unaPlaza"));
        columnaUnaPlaza.setCellFactory(TextFieldTableCell.forTableColumn());
        columnaUnaPlaza.setEditable(true);

        columnaMatrimoniales.setCellValueFactory(new PropertyValueFactory<>("matrimoniales"));
        columnaMatrimoniales.setCellFactory(TextFieldTableCell.forTableColumn());
        columnaMatrimoniales.setEditable(true);

        columnaCucheta.setCellValueFactory(new PropertyValueFactory<>("cucheta"));
        columnaCucheta.setCellFactory(TextFieldTableCell.forTableColumn());
        columnaCucheta.setEditable(true);

        habitacionesData.add(new HabitacionTableModel("1", "Habitación 101", "2", "1", "0"));
        habitacionesData.add(new HabitacionTableModel("2", "Habitación 102", "1", "0", "1"));
        habitacionesData.add(new HabitacionTableModel("3", "Habitación 201", "0", "2", "0"));

        tablaHabitaciones.setItems(habitacionesData);
    }

    public static class HabitacionTableModel {
        private String id;
        private String nombre;
        private String unaPlaza;
        private String matrimoniales;
        private String cucheta;

        public HabitacionTableModel(String id, String nombre, String unaPlaza, String matrimoniales, String cucheta) {
            this.id = id;
            this.nombre = nombre;
            this.unaPlaza = unaPlaza;
            this.matrimoniales = matrimoniales;
            this.cucheta = cucheta;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getUnaPlaza() {
            return unaPlaza;
        }

        public void setUnaPlaza(String unaPlaza) {
            this.unaPlaza = unaPlaza;
        }

        public String getMatrimoniales() {
            return matrimoniales;
        }

        public void setMatrimoniales(String matrimoniales) {
            this.matrimoniales = matrimoniales;
        }

        public String getCucheta() {
            return cucheta;
        }

        public void setCucheta(String cucheta) {
            this.cucheta = cucheta;
        }
    }
}
