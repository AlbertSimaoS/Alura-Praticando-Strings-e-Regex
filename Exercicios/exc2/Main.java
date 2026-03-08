import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto:");

        String text = scanner.nextLine();

        System.out.println("Texto em maiúscula: " + text.toUpperCase());
        System.out.println("Texto em minúscula: " + text.toLowerCase());

        scanner.close();
    }
}
