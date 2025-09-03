import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "kisna";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "maria";
        passwords[2] = "12345";*/

        String[] usernames = {"kisna","admin","maria"};
        String[] passwords = {"12345","12345","12345"};

        System.out.println("Ingrese el usuario:");
        String user = scanner.next();

        System.out.println("Ingrese la contraseña:");
        String pass = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(user) && passwords[i].equals(pass)){
                esAutenticado = true;
                break;
            }else{
                System.out.println("user o contraseña incorrectos");
            }
        }

        if(esAutenticado){
            System.out.println("¡Bienvenido usuario ".concat(user).concat("!"));
        }else{
            System.out.println("Lo siento requiere autenticacion");
        }
    }
}
