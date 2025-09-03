import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Principal extends JFrame{
	Inicio i;
	Menu m;
	IngresarNombre ingNombre;
	IngresarMensualidad ingMes;
	IngresarPrestamo ingPrestamo;
	ListaParticipantes listParticipantes;
	ListaPrestamos listPrestamo;
	
	public Principal() {
		inicializarComponentes();
		configurarMenuBotones();
		configurarMainFrame();
		
		// Mostrar la ventana de inicio al inicio
        showPanel(i);
	}
	
	public void inicializarComponentes() {
		i = new Inicio();
		m = new Menu();
		ingNombre = new IngresarNombre();
        ingMes = new IngresarMensualidad();
        ingPrestamo = new IngresarPrestamo();
        listParticipantes = new ListaParticipantes();
        listPrestamo = new ListaPrestamos();
        
        add(i);
        add(m);
        add(ingNombre);
        add(ingMes);
        add(ingPrestamo);
        add(listParticipantes);
        add(listPrestamo);
        
     // Configurar la visibilidad de los paneles
        i.setVisible(true);
        m.setVisible(false);
        ingNombre.setVisible(false);
        ingMes.setVisible(false);
        ingPrestamo.setVisible(false);
        listParticipantes.setVisible(false);
        listPrestamo.setVisible(false);
	}
	
	public void configurarMenuBotones() {
		m.ingresarNombre.addActionListener(e -> showPanel(ingNombre));
        m.ingresarMensualidad.addActionListener(e -> showPanel(ingMes));
        m.ingresarPrestamo.addActionListener(e -> showPanel(ingPrestamo));
        m.listaParticipantes.addActionListener(e -> showPanel(listParticipantes));
        m.listaPrestamos.addActionListener(e -> showPanel(listPrestamo));
	}
	
	public void showPanel(JPanel panelToShow) {
		for (Component component : getContentPane().getComponents()) {
            if (component instanceof JPanel) {
                component.setVisible(false);
            }
        }
        panelToShow.setVisible(true);
        setSize(panelToShow.getWidth(), panelToShow.getHeight());
	}
	
	public void configurarMainFrame() {
		setTitle("COOPERATIVA FAMILIAR");
        setSize(m.getWidth(), m.getHeight());
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	
	public static void main(String []args) {
		SwingUtilities.invokeLater(() -> new Principal());
		//new Principal();
	}
}
