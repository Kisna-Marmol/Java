public class SentenciaSwitchCase {
    public static void main(String[] args) {
        char num = 'a' ;
        switch (num) {
            case '0' :
                System. out.println("El num es cero");
                break;
            case '1' :
                System. out.println("El num es uno");
                break;
            case '2' :
                System. out.println("El num es dos");
                break;
            case '3' :
                System. out.println("El numero es tres");
                break;
            case 'a':
                System. out. println("El caracter es a");
                break;
            default :
                System.out.println("Numero o caracter desconocido.");
        }
    }
}
