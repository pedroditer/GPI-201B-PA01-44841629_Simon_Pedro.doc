import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es tu nombre?");
        String nombre = entrada.next();
        //System.out.println("Tu nombre es: " + nombre);

        System.out.println("Cual es tu edad?");
        int edad = entrada.nextInt();
        //System.out.println("Tu edad es: " + edad);

        System.out.println("Ingrese su numero de telefono");
        String telefono = entrada.next();

        System.out.printf("""
                \nDatos ingresados:\s
                - Nombre: %s\s
                - Edad: %d\s
                - Telefono: %s""", nombre, edad, telefono);
    }


}
