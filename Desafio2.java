import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("   Conversor de Celsius → Fahrenheit");
        System.out.println("===================================");
        System.out.print("Digite a temperatura em graus Celsius: ");

        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();

            System.out.println("\nConvertendo...");

            if (celsius >= -273.15) {
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("🌡️ Resultado: %.1f°F\n", fahrenheit);
            } else {
                System.out.println("❌ Temperatura abaixo do zero absoluto (-273.15°C). Entrada inválida!");
            }
        } else {
            System.out.println("❌ Entrada inválida! Digite um número válido.");
        }

        System.out.println("===================================");
        scanner.close();
    }
}