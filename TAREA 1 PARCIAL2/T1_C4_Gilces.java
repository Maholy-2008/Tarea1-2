import java.util.Scanner;


public class T1_C4_Gilces {

   
    static int contarDigitos(int n) {
        int cuenta = 1;
        while (n >= 10) {
            n = n / 10;
            cuenta++;
        }
        return cuenta;
    }

    
    static int potencia(int b, int e) {
        int resultado = 1;
        for (int i = 1; i <= e; i++) {
            resultado = resultado * b;
        }
        return resultado;
    }

   
    static boolean esArmstrong(int n) {
        int digitos = contarDigitos(n);
        int suma = 0;
        int resto = n;
        while (resto > 0) {
            int digito = resto % 10;
            suma = suma + potencia(digito, digitos);
            resto = resto / 10;
        }
        return suma == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();
        if (esArmstrong(n)) {
            System.out.println(n + " SI es un numero de Armstrong.");
        } else {
            System.out.println(n + " NO es un numero de Armstrong.");
        }
    }
}
