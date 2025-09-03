import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
public class Inicio extends JPanel{
	JButton inicio;
	public Inicio() {
		inicio = new JButton("INICIO");
		inicio.setBounds(150,150,80,30);
		inicio.setBackground(Color.GREEN);
		setLayout(null); // Establecer el diseño en nulo para posicionar el botón manualmente
	    add(inicio);
		//setBackground(Color.CYAN);
		setSize(400,400);
		
	}
}
