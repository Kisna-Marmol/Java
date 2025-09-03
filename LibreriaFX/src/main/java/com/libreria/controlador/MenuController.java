package com.libreria.controlador;

import javafx.fxml.FXML; //importa la anotacion @FXML para enlazar los metodos con la vista
import javafx.scene.control.Button; //importa la clace button para manejar los botones
import javafx.event.ActionEvent; //importa el ActionEvent para manejar los botones

public class MenuController {
    //Definicion de los mentodos que seran llamados al presionar los botones
    @FXML //indica que este metodo esta vinculado a un boton en la interfaz
    public void gestionarLibros(ActionEvent event){
        System.out.println("Gestionar Libros");
    }
    @FXML
    public void gestionarClientes(ActionEvent event){
        System.out.println("Gestionar Clientes");
    }
    @FXML
    public void gestionarVentas(ActionEvent event){
        System.out.println("Gestionar Ventas");
    }
    @FXML
    public void gestionarStock(ActionEvent event){
        System.out.println("Gestionar Stock");
    }
    @FXML
    public void verReportes(ActionEvent event){
        System.out.println("Ver reportes");
    }
    @FXML
    public void configuracion(ActionEvent event){
        System.out.println("Configuracion");
    }
    @FXML
    public void salir(ActionEvent event){
        System.out.println("Salir del sistema");
        System.exit(0);//salir del sistema
    }
}
