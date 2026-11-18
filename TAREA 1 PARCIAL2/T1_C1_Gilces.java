import java.util.Locale;
import java.util.Scanner;


public class T1_C1_Gilces {

    
    static double leerConsumo(Scanner sc) {
        System.out.print("Consumo del mes (m3): ");
        double m3 = sc.nextDouble();
        while (m3 < 0) {
            System.out.println("Error: el consumo no puede ser negativo.");
            System.out.print("Consumo del mes (m3): ");
            m3 = sc.nextDouble();
        }
        return m3;
    }

   
    static double calcularValor(double m3) {
        double valor = 2.50;
        if (m3 <= 15) {
            valor = valor + m3 * 0.40;
        } else {
            valor = valor + 15 * 0.40 + (m3 - 15) * 0.75;
        }
        return valor;
    }

    
    static void mostrarPlanilla(double m3, double valor) {
        System.out.println("---- PLANILLA DE AGUA ----");
        System.out.printf(Locale.US, "Consumo: %.2f m3%n", m3);
        System.out.printf(Locale.US, "Total a pagar: $%.2f%n", valor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double m3 = leerConsumo(sc);
        double valor = calcularValor(m3);
        mostrarPlanilla(m3, valor);
    }
}
