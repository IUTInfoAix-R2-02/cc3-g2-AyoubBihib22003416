package fr.amu.iut.cc3;

import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javax.swing.*;
import java.awt.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ToileController implements Initializable {

    private static int rayonCercleExterieur = 200;
    private static int angleEnDegre = 60;
    private static int angleDepart = 90;
    private static int noteMaximale = 20;

    @FXML
    private TextField comp1;
    @FXML
    private TextField comp2;
    @FXML
    private TextField comp3;
    @FXML
    private TextField comp4;
    @FXML
    private TextField comp5;
    @FXML
    private TextField comp6;
    @FXML
    private Pane pane;
    @FXML
    private Line comp1et4;
    @FXML
    private Line comp2et5;
    @FXML
    private Line comp3et6;
    @FXML
    private Circle c1;
    @FXML
    private Circle c2;
    @FXML
    private Circle c3;
    @FXML
    private Circle c4;
    @FXML
    private Circle c5;
    @FXML
    private Circle c6;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    int getXRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur + Math.cos(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }

    int getYRadarChart(double value, int axe ){
        return (int) (rayonCercleExterieur - Math.sin(Math.toRadians(angleDepart - (axe-1)  * angleEnDegre)) * rayonCercleExterieur
                *  (value / noteMaximale));
    }
    @FXML
    private void viderClicked() {
        comp1.setText("");
        comp2.setText("");
        comp3.setText("");
        comp4.setText("");
        comp5.setText("");
        comp6.setText("");
    }
    @FXML
    private void tracerClicked() {
        int number1 = Integer.parseInt(comp1.getText());
        int number2 = Integer.parseInt(comp2.getText());
        int number3 = Integer.parseInt(comp3.getText());
        int number4 = Integer.parseInt(comp4.getText());
        int number5 = Integer.parseInt(comp5.getText());
        int number6 = Integer.parseInt(comp6.getText());



        if(number1 > 20 || number1<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        if(number2 > 20 || number2<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        if(number3 > 20 || number3<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        if(number4 > 20 || number4<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        if(number5 > 20 || number5<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        if(number6 > 20 || number6<0 ) {
            System.out.println("Veuillez entrer des bonnes valeurs");
        }
        c1.setCenterX(getXRadarChart(number1,1));
        c1.setCenterY(getYRadarChart(number1,1));
        c1.setRadius(5);
        c2.setCenterX(getXRadarChart(number2,2));
        c2.setCenterY(getYRadarChart(number2,2));
        c2.setRadius(5);
        c3.setCenterX(getXRadarChart(number3,3));
        c3.setCenterY(getYRadarChart(number3,3));
        c3.setRadius(5);
        c4.setCenterX(getXRadarChart(number4,4));
        c4.setCenterY(getYRadarChart(number4,4));
        c4.setRadius(5);
        c5.setCenterX(getXRadarChart(number5,5));
        c5.setCenterY(getYRadarChart(number5,5));
        c5.setRadius(5);
        c6.setCenterX(getXRadarChart(number6,6));
        c6.setCenterY(getYRadarChart(number6,6));
        c6.setRadius(5);

    }
}
