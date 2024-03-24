import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para encontrar os números primos até ele: ");
        int limite = scanner.nextInt();

        System.out.println("Números primos entre 1 e " + limite + ":");

        for (int numero = 2; numero <= limite; numero++) {
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.print(numero + " ");
            }
        }

        scanner.close();
    }
}
