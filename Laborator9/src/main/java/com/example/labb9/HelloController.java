package com.example.labb9;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

      @FXML
    private TextField nodCrt = new TextField();
    @FXML
    private TextArea zonaTextArea=new TextArea();

   private static String[]sir;
   private String s1;
   @FXML
   private static int nr=0;
  @FXML
  private ListView<String> ITEMS;
    @FXML
    protected  void Scriere_Fisier(){
        try {
            BufferedWriter fisier = new BufferedWriter(
                    new FileWriter("C:\\Users\\filip\\Desktop\\LABB9"));
            fisier.write(nodCrt.getText());
               zonaTextArea.setText(nodCrt.getText()+ " s-a inserat");
              nodCrt.setText(null);

            fisier.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    @FXML
    protected void Citire_Fisier(){
        String s;
        try{
            BufferedReader fisier=new BufferedReader(
                    new FileReader("D:\\FACULTATE\\ANUL 3\\SEMESTRUL 1\\SDA\\LABORATOR\\LABB9\\fisier")
            );
            while((s=fisier.readLine())!=null){
              ///  zonaTextArea.setText("\n"+s);
                  nr++;

            }
            zonaTextArea.setText("S-au citit "+ nr+ " cuvinte");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

     @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
           String[]items={"RSD","SRD","SDR"};
           ITEMS.getItems().addAll(items);
          ITEMS.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
              @Override
              public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                  s1=ITEMS.getSelectionModel().getSelectedItem();
                  if(s1=="RSD"){
                      zonaTextArea.setText("RSD: date");
                  }
                  else {
                      if (s1 == "SRD") {
                          zonaTextArea.setText("SRD: date structuri");
                      }


                      if (s1 == "SDR") {
                          zonaTextArea.setText("SRD: date de structuri");
                      }
                  }


              }
          });
   }





}