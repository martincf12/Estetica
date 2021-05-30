package controladores;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Objects;

public class ProgramaVero extends Application {

    private Stage stagePrincipal;
    public static String dashboard ="/ventanas/Dashboard.fxml";
    public static String agregarCliente ="/ventanas/AgregarCliente.fxml";
    public static String resumen ="/ventanas/Resumen.fxml";

    @Override
    public void start(Stage stagePrincipal) throws Exception {
        this.stagePrincipal = stagePrincipal;
        mostrarVentanaPrincipal();
    }

    public void mostrarVentanaPrincipal() throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(dashboard)));
        stagePrincipal.setTitle("Estética VC");
        stagePrincipal.setResizable(false);
        stagePrincipal.setScene(new Scene(root, 1100, 580));
        stagePrincipal.show();
    }

    public void mostrarVentanaSecundaria(Event event) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(agregarCliente)));
            Scene scene = new Scene(root);
            Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            appStage.setScene(scene);
            appStage.toFront();
            appStage.show();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        launch(args);
    }


}
