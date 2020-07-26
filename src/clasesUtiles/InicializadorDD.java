package clasesUtiles;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class InicializadorDD {

    public static ObservableList<String> inicializarDDSiNo(){
        List<String> list = new ArrayList<>();
        list.add("NO");
        list.add("SI");
        return FXCollections.observableList(list);
    }

    public static ObservableList<String> inicializarDDNumeros(){
        List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        return FXCollections.observableList(list);
    }
}
