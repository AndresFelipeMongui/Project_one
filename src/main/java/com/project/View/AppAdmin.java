package com.project.View;

import java.beans.EventHandler;



import com.project.Connection.Conexiones;
import com.project.Connection.StudentQuery;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class AppAdmin extends Application {

    Conexiones con=new Conexiones();
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       Button btn = new Button();
       btn.setText("Realizar Consulta");

       btn.setOnAction(event -> {
        
      //  System.out.println("Resultado: " + sq.readSQL("select id_student, first_name, last_name,email from student"));
         });

         StackPane root = new StackPane();
         root.getChildren().add(btn);
         Scene scene = new Scene(root,300,250); 

         primaryStage.setTitle("Ventana Consulta");
         primaryStage.setScene(scene);
         primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }

    
    
}
