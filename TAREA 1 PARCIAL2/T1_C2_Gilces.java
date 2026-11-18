import java.util.Locale;
import java.util.Scanner;


public class T1_C2_Gilces {

    
    static double leerNota(Scanner sc, String texto) {
        System.out.print(texto + ": ");
        double nota = sc.nextDouble();
        while (nota < 0 || nota > 20) {
            System.out.println("Error: la nota debe estar entre 0 y 20.");
            System.out.print(texto + ": ");
            nota = sc.nextDouble();
        }
        return nota;
    }

    
    static double promedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    
    static String estado(double nota) {
        if (nota >= 14) {
            return "Aprobado";
        } else if (nota >= 9) {
            return "Supletorio";
        } else {
            return "Reprobado";
        }
    }

    
    static double necesitaEnSupletorio(double nota) {
        if (nota >= 9 && nota < 14) {
            return 28 - nota;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double n1 = leerNota(sc, "Nota 1");
        double n2 = leerNota(sc, "Nota 2");
        double n3 = leerNota(sc, "Nota 3");

        double prom = promedio(n1, n2, n3);
        System.out.printf(Locale.US, "Promedio: %.2f%n", prom);
        System.out.println("Estado: " + estado(prom));

        double minimo = necesitaEnSupletorio(prom);
        if (minimo != -1) {
            System.out.printf(Locale.US, "Nota minima en el supletorio: %.2f%n", minimo);
        }
    }
}
