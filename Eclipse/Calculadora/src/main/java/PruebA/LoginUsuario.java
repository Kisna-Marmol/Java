
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
public class LoginUsuario extends JFrame{

    private JPanel panel;
    private JLabel userLabel, passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton;

    public LoginUsuario(){
        //Configuracion de ventana
        setTitle("Ingreso de Usuario");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ConfigurarComponetes();



        setVisible(true);
    }
    
    public void ConfigurarComponetes(){
        panel.setLayout(null);
        getContentPane().add(panel);

        userLabel = new JLabel("Ingrese su Usuario:");
        userLabel.setBounds(10, 10, 120, 25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Ingrese su Password:");
        passwordLabel.setBounds(10, 40, 120, 25);
        panel.add(passwordLabel);

        userText = new JTextField(20);
        userText.setBounds(140, 10, 120, 25);
        panel.add(userText);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(140, 40, 120, 25);
        panel.add(passwordText);

        loginButton = new JButton("Ingresar");
        loginButton.setBounds(90, 80, 100, 25);
        panel.add(loginButton);
    }

    public static void main(String[] args) {
        new LoginUsuario();
    }
}
