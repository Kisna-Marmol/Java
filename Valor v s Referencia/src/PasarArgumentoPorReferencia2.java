class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarArgumentoPorReferencia2 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.modificarNombre("Kisna");

        System.out.println("Iniciamos el metodo main");
        System.out.println("persona.modificarNombre() = " + persona.leerNombre());
        System.out.println("Antes de llamar al metodo test");
        test(persona);
        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados!");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Yadira");
        System.out.println("Finaliza el metodo test");
    }
}
