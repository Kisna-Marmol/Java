import java.awt.Color;
//import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Menu extends JPanel{
	JLabel titulo;
	Font fuente;
	JButton ingresarNombre;
	JButton ingresarMensualidad;
	JButton ingresarPrestamo;
	JButton listaParticipantes;
	JButton listaPrestamos;
	JButton salir;
	IngresarNombre ingNombre;
	public Menu() {
	    //titulo();
	    //ingresarNombre();
		configurarEntorno();
		//setBackground(Color.CYAN);
		setSize(1000,700);
	}
	
	public void configurarEntorno() {
		// Establecer el gestor de diseño de flujo centrado
        setLayout(null);
        //this.ingNombre = ingNombre;
        titulo();
        ingresarNombre();
        ingresarMensualidad();
        ingresarPrestamo();
        listaParticipantes();
        listaPrestamos();
        salir();
	}
	
	public void titulo() {
		titulo = new JLabel("MENU");
        fuente = new Font("Arial", Font.BOLD, 35);
        titulo.setFont(fuente);

        // Establece la posición manualmente
        titulo.setBounds(420, 30, 200, 30);

        add(titulo);
	}
	
	public void ingresarNombre() {
		ingresarNombre = new JButton("INGRESAR NOMBRE");
        ingresarNombre.setBackground(new Color(207,133,66));

        // Establece la posición manualmente
        ingresarNombre.setBounds(250, 150, 200, 30);

        //ingresarNombre.addActionListener(e -> ingNombre());
        
        add(ingresarNombre);
	}
	
	public void ingresarMensualidad() {
		ingresarMensualidad = new JButton("INGRESAR CANT MENSUAL");
		ingresarMensualidad.setBackground(new Color(207,133,66));
		
		// Establece la posición manualmente
        ingresarMensualidad.setBounds(500, 150, 200, 30);
        
        add(ingresarMensualidad);
	}
	
	public void ingresarPrestamo() {
		ingresarPrestamo = new JButton("INGRESAR PRESTAMOS");
		ingresarPrestamo.setBackground(new Color(207,133,66));
		
		// Establece la posición manualmente
        ingresarPrestamo.setBounds(250, 250, 200, 30);
        
        add(ingresarPrestamo);
	}
	
	public void listaParticipantes() {
		listaParticipantes = new JButton("LISTA DE PARTICIPANTES");
		listaParticipantes.setBackground(new Color(207,133,66));
		
		// Establece la posición manualmente
        listaParticipantes.setBounds(500, 250, 200, 30);
        
        add(listaParticipantes);
	}
	
	public void listaPrestamos() {
		listaPrestamos = new JButton("LISTA DE PRESTAMOS");
		listaPrestamos.setBackground(new Color(207,133,66));
		
		// Establece la posición manualmente
        listaPrestamos.setBounds(250, 350, 200, 30);
        
        add(listaPrestamos);
	}
	
	public void salir() {
		salir = new JButton("SALIR");
		salir.setBackground(new Color(207,133,66));
		
		// Establece la posición manualmente
        salir.setBounds(500, 350, 200, 30);
        
        add(salir);
	}
}
