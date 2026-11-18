import java.util.Locale;
import java.util.Scanner;


public class T1_C3_Gilces {

    
    static double volumen(double lado) {
        return lado * lado * lado;
    }

    
    static double volumen(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }

    
    static double volumen(double largo, double ancho, double alto) {
        return largo * ancho * alto;
    }

    
    static void mostrarMenu() {
        System.out.println();
        System.out.println("===== VOLUMENES =====");
        System.out.println("1. Cubo");
        System.out.println("2. Cilindro");
        System.out.println("3. Prisma rectangular");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.print("Lado: ");
                double lado = sc.nextDouble();
                System.out.printf(Locale.US, "Volumen del cubo = %.2f%n", volumen(lado));
            } else if (opcion == 2) {
                System.out.print("Radio: ");
                double radio = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                double v = volumen(radio, altura);
                System.out.printf(Locale.US, "Volumen del cilindro = %.2f%n", v);
            } else if (opcion == 3) {
                System.out.print("Largo: ");
                double largo = sc.nextDouble();
                System.out.print("Ancho: ");
                double ancho = sc.nextDouble();
                System.out.print("Alto: ");
                double alto = sc.nextDouble();
                double v = volumen(largo, ancho, alto);
                System.out.printf(Locale.US, "Volumen del prisma = %.2f%n", v);
            } else if (opcion != 0) {
                System.out.println("Opcion no valida.");
            }
        } while (opcion != 0);
        System.out.println("Hasta luego.");
    }
}
