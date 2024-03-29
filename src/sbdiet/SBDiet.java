/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbdiet;

import java.util.HashMap;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ui.SBDietUI;

/**
 *
 * @author hanli
 */
public class SBDiet extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        SBDietUI root = new SBDietUI(primaryStage);
        root.startUI();
        Scene scene = new Scene(root.getMainPane(), root.getpaneWidth(), root.getpaneHeight());
        primaryStage.setScene(scene);
        primaryStage.setTitle("SB's Diet");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
