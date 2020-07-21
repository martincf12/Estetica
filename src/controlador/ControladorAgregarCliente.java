package controlador;

import javafx.scene.layout.Pane;

public class ControladorAgregarCliente {

    public Pane hojaDatosPersonales;
    public Pane hojaAntecedentes;
    public Pane hojaSemiologia;
    public Pane hojaMedidas;

    public void traerAdelanteDatosPersonales(){
        hojaDatosPersonales.toFront();
    }

    public void traerAdelanteAntecedentes(){
        hojaAntecedentes.toFront();
    }

    public void traerAdelanteSemiologia(){
        hojaSemiologia.toFront();
    }

    public void traerAdelanteMedidas(){
        hojaMedidas.toFront();
    }

}
