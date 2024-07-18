package com.example.laboratorul12;

import java.util.List;
import java.util.Map;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
public class SelectareItem implements ChangeListener<String>{
    Map<?, List<Student>> map;
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue){

    }
    public SelectareItem( Map<?, List<Student>> map){
        this.map=map;
    }

}
