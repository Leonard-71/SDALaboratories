package com.example.lab12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;






public class OBradFrumos extends Application {
    private static TextArea rezultatCautare;
    private static Label nrInregistrari;
    private final ImageView imageView = new ImageView();
    private Text topText;
    private Label eticValSelectata;
    private ListaMosului listaMosului;
    private static Label Nume;
    private static Label spatiere;
    private static Label Localitate;
    private static ChoiceBox NumeBox;
    private static ChoiceBox LocalitateBox;
    private static Button CitesteFisier;







    private static TextArea getTextArea(String textInitial) {
        TextArea ta = new TextArea();
        ta.appendText(textInitial);
        ta.setPrefWidth(400);
        ta.setPrefHeight(370);
        ta.setWrapText(true);
        return ta;
    }


    private ChoiceBox getChoiceBox(Map<String, List<Student>> map) {
        ObservableList<String> listaItemi= FXCollections.observableArrayList(map.keySet());
        ChoiceBox<String> list = new ChoiceBox<>(listaItemi);
        list.getSelectionModel().selectedItemProperty().addListener(new SelectareItem(map));
        return list;
    }



   Slider getSlider() {
       Slider valMedie=new Slider(0,10,1);
       valMedie.setMajorTickUnit(0.5);
       valMedie.setPrefWidth(550);
       valMedie.setShowTickMarks(true);
       valMedie.setShowTickLabels(true);

        valMedie.valueProperty().addListener ( new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov,
                                Number old_val, Number new_val) {
                double valSelectata = new_val.doubleValue();
                eticValSelectata.setText(String.format("Stud. cu media >= %.2f", new_val));
                List <Student> lstDupaMedie=new ArrayList<>();
           afișareRezultat(lstDupaMedie);
            }
        });
        return valMedie;
    }

    static void afișareRezultat(List<Student> lstud) {
            // TO DO
    }



    private BorderPane getPanou() throws FileNotFoundException {
        //code img
        FileInputStream input = new FileInputStream("C:\\Users\\filip\\Desktop\\lab12\\src\\main\\resources\\brad.jpg");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        imageView.setTranslateY(30);
        imageView.setFitHeight(500);
        imageView.setFitWidth(300);

        BorderPane panou = new BorderPane();
        Slider valMedie = getSlider();
        spatiere=new Label("   ");
        NumeBox.setPrefWidth(150);
        LocalitateBox.setPrefWidth(150);
        Nume=new Label("        Nume");
        Localitate=new Label("Localitate");
        CitesteFisier=new Button("Citeste din fisier");
        panou.setTop(new HBox(25,Nume,NumeBox,Localitate,LocalitateBox,CitesteFisier));
        HBox hBox1= new HBox(5, spatiere, getTextArea(""));
        hBox1.setTranslateY(30);
        hBox1.setPrefWidth(350);
        panou.setLeft(hBox1);
        imageView.setFitWidth(300);
        HBox hBox=new HBox(imageView);
        panou.setRight(hBox);

        eticValSelectata = new Label("Stud. cu Media >= 10" );
        panou.setBottom(new HBox(1, valMedie, eticValSelectata));
        return panou;
    }





    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        listaMosului = new ListaMosului();
        NumeBox=getChoiceBox(listaMosului.getMapNume());
        LocalitateBox=getChoiceBox(listaMosului.getMapLocalitate());
        Scene scena = new Scene(getPanou(), 700, 600);
        primaryStage.setScene(scena);
        primaryStage.setTitle("O, brad frumos!");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
