public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Kisna";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Kisna\") = " + nombre.equals("Kisna"));
        System.out.println("nombre.equals(\"kisna\") = " + nombre.equals("kisna"));
        System.out.println("nombre.equalsIgnoreCase(\"kisna\") = " + nombre.equalsIgnoreCase("kisna"));
        System.out.println("nombre.compareTo(\"Kisna\") = " + nombre.compareTo("Kisna"));
        System.out.println("nombre.compareTo(\"Yadira\") = " + nombre.compareTo("Yadira"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println("  trabalenguas ".trim());
    }
}

