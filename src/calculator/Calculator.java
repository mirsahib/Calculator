/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javafx.stage.Stage;

/**
 *
 * @author Aspire
 */
public class Calculator extends Application {
    
    TextField display;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);      
        stage.setScene(scene);
        stage.setTitle("Calculator");
        Image icon = new Image(getClass().getResourceAsStream("/image/calculator.png"));
        //display.setPromptText("0");
        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
