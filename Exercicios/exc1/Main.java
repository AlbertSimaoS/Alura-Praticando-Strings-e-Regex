import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");

        String name = scanner.nextLine();

        System.out.println("Nome sem espaços: " + name.trim());

        scanner.close();
    }
}
