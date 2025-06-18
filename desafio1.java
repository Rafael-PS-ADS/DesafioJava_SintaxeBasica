import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("      Validador de E-mail");
        System.out.println("===================================");
        System.out.print("Digite seu e-mail institucional: ");

        String email = scanner.nextLine();

        System.out.println("\nVerificando e-mail...");

        if (email.endsWith("@company.com")) {
            System.out.println("✅ E-mail válido! Acesso permitido.");
        } else {
            System.out.println("❌ E-mail inválido! Use um e-mail @company.com.");
        }

        System.out.println("===================================");
        scanner.close();
    }
}