import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListaParticipantes extends JPanel{
	JLabel titulo;
	Font fuente;
	public ListaParticipantes() {
		configurarEntorno();
		setSize(300,200);
	}
	
	public void configurarEntorno() {
		// Establecer el gestor de diseño de flujo centrado
        setLayout(null);
        //this.ingNombre = ingNombre;
        titulo();
	}
	
	public void titulo() {
		titulo = new JLabel("LISTS DE PARTICIPANTES");
        fuente = new Font("Arial", Font.BOLD, 35);
        titulo.setFont(fuente);

        // Establece la posición manualmente
        titulo.setBounds(50, 30, 200, 30);

        add(titulo);
	}
}
