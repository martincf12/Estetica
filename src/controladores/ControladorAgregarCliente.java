package controladores;

import clasesUtiles.Cliente;
import clasesUtiles.InicializadorDD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ControladorAgregarCliente implements Initializable {

    @FXML Pane hojaDatosPersonales;
    @FXML Pane hojaAntecedentes;
    @FXML Pane hojaSemiologia;
    @FXML Pane hojaMedidas;

    @FXML TextField nombreApellido;
    @FXML TextField domicilio;
    @FXML TextField telefono;
    @FXML TextField email;
    @FXML TextField profesion;
    @FXML DatePicker fechaNacimiento;

    @FXML TextField derivadoPor;
    @FXML ComboBox alergicoDD;
    @FXML ComboBox diabeticoDD;
    @FXML ComboBox partosDD;
    @FXML TextField tratamientoDietetico;
    @FXML ComboBox tensionArterialDD;
    @FXML TextField antecedentesHormonales;
    @FXML TextField temperamento;
    @FXML ComboBox cigarrilloDD;
    @FXML ComboBox alcoholDD;
    @FXML ComboBox numeroDeCirugiasDD;

    @FXML ComboBox biotipoCutaneoNormal;
    @FXML ComboBox biotipoCutaneoSecoAlipico;
    @FXML ComboBox biotipoCutaneoFluente;
    @FXML ComboBox biotipoCutaneoXerodermico;
    @FXML ComboBox biotipoCutaneoSecoDeshidratado;
    @FXML ComboBox biotipoCutaneoSensible;
    @FXML TextField biotipoCutaneoColor;
    @FXML ComboBox biotipoCutaneoTextura;
    @FXML TextField biotipoCutaneoPigmento;
    @FXML TextField biotipoCutaneoLocaPigmentoLocalizacion;
    @FXML TextField biotipoCutaneoCicatrices;
    @FXML TextField biotipoCutaneoCicatricesLocalizacion;
    @FXML TextField biotipoCutaneoLesiones;
    @FXML TextField plieguesArrugasDeAcuerdoAlBT;
    @FXML TextField plieguesArrugasInducidasPorSol;
    @FXML ComboBox localizacionParpados;
    @FXML ComboBox localizacionPeribucales;
    @FXML ComboBox localizacionNasogeniano;
    @FXML ComboBox localizacionFrente;
    @FXML ComboBox localizacionPreauriculares;
    @FXML ComboBox cuelloTonicidad;
    @FXML ComboBox cuelloDanioSolar;
    @FXML ComboBox cuelloFlacidez;
    @FXML ComboBox velloCara;
    @FXML ComboBox velloMalar;
    @FXML ComboBox velloMentoniano;
    @FXML ComboBox velloBozo;
    @FXML ComboBox velloSeDepila;
    @FXML ComboBox velloHirsutamo;
    @FXML ComboBox velloHipertricosis;
    @FXML ComboBox cueroCabelludoSeco;
    @FXML ComboBox cueroCabelludoGraso;
    @FXML ComboBox cueroCabelludoEritema;
    @FXML ComboBox cueroCabelludoLesiones;
    @FXML ComboBox cueroCabelludoAlopecias;
    @FXML ComboBox cueroCabelludoTipo;
    @FXML ComboBox cueroCabelludoOnicopatias;
    @FXML ComboBox cueroCabelludoAntecedentes;
    @FXML ComboBox cueroCabelludoDescamacion;
    @FXML ComboBox cueroCabelludoUnias;
    @FXML ComboBox cueroCabelludoPitiriasis;
    @FXML ComboBox cueroCabelludoPrurito;
    @FXML ComboBox cueroCabelludoExcoriaciones;
    @FXML ComboBox esquemaCorporalCelulitis;
    @FXML TextField esquemaCorporalTipo;
    @FXML TextField esquemaCorporalCelulitisLocalizacion;
    @FXML ComboBox esquemaCorporalEstrias;
    @FXML TextField esquemaCorporalEstriasLocalizacion;
    @FXML TextField acneTipo;
    @FXML TextField acneTiempoEvolucion;
    @FXML TextField acneAntecedentesHereditarios;
    @FXML TextField acneLesionesElementales;
    @FXML TextField acneLesionesElementalesLocalizacion;
    @FXML TextField acneRosaceaTipo;
    @FXML TextField acneRosaceaTipoTiempoEvolucion;
    @FXML TextField acneRosaceaTipoLocalizacion;
    @FXML TextField acneRosaceaTipoAntHereditarios;
    @FXML ComboBox acnePielSenil;
    @FXML ComboBox acneQueratosisActinicas;
    @FXML ComboBox acneElatosisSolar;
    @FXML TextField acneOtrasAlteraciones;
    @FXML TextField acneInvolucionSegunEdad;
    @FXML TextField acneTratamientosDermatologicos;
    @FXML TextField acneTratamientosCosmeticos;

    @FXML TextField arribaDelOmbligo;
    @FXML TextField abajoDelOmbligo;
    @FXML TextField brazoDerecho;
    @FXML TextField brazoIzquierdo;
    @FXML TextField cadera;
    @FXML TextField talla;
    @FXML TextField peso;

    private final List<ComboBox> listOfElementsSiNo = new ArrayList<>();
    private final List<ComboBox> listOfElementsNumeros = new ArrayList<>();

    private void cargarListaComboBox(){
        listOfElementsSiNo.add(alergicoDD);
        listOfElementsNumeros.add(partosDD);
        listOfElementsSiNo.add(diabeticoDD);
        listOfElementsSiNo.add(tensionArterialDD);
        listOfElementsSiNo.add(cigarrilloDD);
        listOfElementsSiNo.add(alcoholDD);
        listOfElementsNumeros.add(numeroDeCirugiasDD);
        listOfElementsSiNo.add(biotipoCutaneoNormal);
        listOfElementsSiNo.add(biotipoCutaneoSecoAlipico);
        listOfElementsSiNo.add(biotipoCutaneoFluente);
        listOfElementsSiNo.add(biotipoCutaneoXerodermico);
        listOfElementsSiNo.add(biotipoCutaneoSecoDeshidratado);
        listOfElementsSiNo.add(biotipoCutaneoSensible);
        listOfElementsSiNo.add(biotipoCutaneoTextura);
        listOfElementsSiNo.add(localizacionParpados);
        listOfElementsSiNo.add(localizacionPeribucales);
        listOfElementsSiNo.add(localizacionNasogeniano);
        listOfElementsSiNo.add(localizacionFrente);
        listOfElementsSiNo.add(localizacionPreauriculares);
        listOfElementsSiNo.add(cuelloTonicidad);
        listOfElementsSiNo.add(cuelloDanioSolar);
        listOfElementsSiNo.add(cuelloFlacidez);
        listOfElementsSiNo.add(velloCara);
        listOfElementsSiNo.add(velloMalar);
        listOfElementsSiNo.add(velloMentoniano);
        listOfElementsSiNo.add(velloBozo);
        listOfElementsSiNo.add(velloSeDepila);
        listOfElementsSiNo.add(velloHirsutamo);
        listOfElementsSiNo.add(velloHipertricosis);
        listOfElementsSiNo.add(cueroCabelludoSeco);
        listOfElementsSiNo.add(cueroCabelludoGraso);
        listOfElementsSiNo.add(cueroCabelludoEritema);
        listOfElementsSiNo.add(cueroCabelludoLesiones);
        listOfElementsSiNo.add(cueroCabelludoAlopecias);
        listOfElementsSiNo.add(cueroCabelludoTipo);
        listOfElementsSiNo.add(cueroCabelludoOnicopatias);
        listOfElementsSiNo.add(cueroCabelludoAntecedentes);
        listOfElementsSiNo.add(cueroCabelludoDescamacion);
        listOfElementsSiNo.add(cueroCabelludoUnias);
        listOfElementsSiNo.add(cueroCabelludoPitiriasis);
        listOfElementsSiNo.add(cueroCabelludoPrurito);
        listOfElementsSiNo.add(cueroCabelludoExcoriaciones);
        listOfElementsSiNo.add(esquemaCorporalCelulitis);
        listOfElementsSiNo.add(esquemaCorporalEstrias);
        listOfElementsSiNo.add(acnePielSenil);
        listOfElementsSiNo.add(acneQueratosisActinicas);
        listOfElementsSiNo.add(acneElatosisSolar);
    }

    public void traerAdelanteDatosPersonales(){hojaDatosPersonales.toFront();}
    public void traerAdelanteAntecedentes(){hojaAntecedentes.toFront();}
    public void traerAdelanteSemiologia(){hojaSemiologia.toFront();}
    public void traerAdelanteMedidas(){hojaMedidas.toFront();}

    public void initialize(){
        cargarListaComboBox();
        listOfElementsSiNo.forEach((element) -> {
            element.getItems().clear();
            element.setItems(InicializadorDD.inicializarDDSiNo());
        });
        listOfElementsNumeros.forEach((element) -> {
            element.getItems().clear();
            element.setItems(InicializadorDD.inicializarDDNumeros());
        });

    }

    public Cliente tomarValoresClienteCreado() {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNombreApellido(nombreApellido.getText());
        nuevoCliente.setDireccion(domicilio.getText());
        nuevoCliente.setTelefono(telefono.getText());
        nuevoCliente.setMail(email.getText());
        nuevoCliente.setProfesion(profesion.getText());
//      nuevoCliente.setFechaNacimiento(fechaNacimiento.????????);
        return nuevoCliente;
    }

    private Stage stagePrincipal;

    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }

    @FXML
    private void salirVentana(ActionEvent event) {
        stagePrincipal.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
