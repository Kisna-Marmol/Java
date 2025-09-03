package com.libreria.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LibreriaApp  extends Application {
    public void start(Stage primaryStage){
        StackPane root = new StackPane();

        Scene escena = new Scene(root, 800, 600);

        primaryStage.setTitle("Gestion de Libros");

        primaryStage.setScene(escena);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
