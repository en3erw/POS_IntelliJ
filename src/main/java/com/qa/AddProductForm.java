package com.qa;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddProductForm extends Application{





    @Override
    public void start(Stage primaryStage) throws Exception {

            Parent root  = FXMLLoader.load(getClass().getResource("addProductsForm.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.show();


            dasdasdasda;
    }
    public static void main(String... args){
        launch(args);
    }

}