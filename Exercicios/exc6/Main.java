import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        Double value = scanner.nextDouble();

        String newFormatValue = String.format("R$ %.2f", value);

        System.out.printf("Valor formatado: " + newFormatValue);

        scanner.close();
    }
}
