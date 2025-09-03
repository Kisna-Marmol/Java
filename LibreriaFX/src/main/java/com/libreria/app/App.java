package com.libreria.app;

import javafx.application.Application; //importa la clase base para las aplicaciones javafx
import javafx.fxml.FXMLLoader; //importa el cargador de archivos fxml
import javafx.scene.Scene; //importa la clase Scene para gestionar la interfaz grafica
import javafx.stage.Stage; //importa la clase Stage que representa la ventana principal
import java.io.IOException; //importa la clase IOException para manejar errores de carga de archivos

public class App extends Application //define la clase principal que extiende application de JavaFx
{
    //@Override //suscribe el metodo start() que se ejecuta al iniciar la aplicacion
    public void start(Stage primaryStage) throws IOException{
        //Cargar el archivo FXML del menu principal
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/libreria/vista/menu/menu.fxml"));

        //crear la escena con el diseño cargado desde el archivo FXML
        Scene escena = new Scene(fxmlLoader.load());

        //configuracion de la ventana principal
        primaryStage.setTitle("Sistema de Gestion de Libreria"); //establece el titulo de la ventana
        primaryStage.setScene(escena); //Asigna la escena creada a la ventana principal
        primaryStage.show(); //Muestra la ventana principal
    }
    public static void main( String[] args ) {
        launch(args); //Mestodo estatico para iniciar la aplicacion javaFX
    }
}
