import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("calculadora de propinas");
        System.out.println("Ingresa la cantidad a pagar");
        double cantidad = entrada.nextDouble();
        System.out.println("Ingresa el % de propina");
        int porcentaje = entrada.nextInt();

        /*
        if (porcentaje < 15) {
            System.out.println("el servicio no fue muy bueno");
        }else{
            System.out.println("el servicio fue bueno");
        }
        */

        if (porcentaje < 15) {
            System.out.println("el servicio no fue muy bueno");
        }else if (15 <= porcentaje && porcentaje < 30) {
            System.out.println("el servicio fue bueno");
        }else{
            System.out.println("El servicio fue excelente");
        }

        double total = cantidad + (cantidad * porcentaje / 100);
        System.out.printf("El total es %.1f", total);
    }
}
