package controladores;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorDashboard{

    private ProgramaVero prueba = new ProgramaVero();

    @FXML
    private void nuevaVentana(ActionEvent event) {
        prueba.mostrarVentanaSecundaria(event);
    }

    public void setNuevaVentana(ProgramaVero prueba) {
        this.prueba = prueba;
    }

    public void initialize() {
        // TODO
    }
}
