import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] nombres = new String[3];
        
        for (int i = 0; i < nombres.length; i++){
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la persona "+nombres[i]);

        }

        String nombreMasLargo = "";
        String personaConNombreMasLargo = "";

        for (String nombre : nombres){
            String nom = nombre.split(" ")[0];
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;
                personaConNombreMasLargo = nombre;
            }
        }

        JOptionPane.showMessageDialog(null, personaConNombreMasLargo+" tiene el nombre mas largo");
    }
}