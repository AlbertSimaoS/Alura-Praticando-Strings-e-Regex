import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();

        System.out.println("Digite a palavra: ");
        String word = scanner.nextLine();

        if(text.contains(word)){
            System.out.println("A palavra '"+ word + "' está presente no texto.");
        } else{
            System.out.println("A palavra '"+ word + "' não está presente no texto.");
        }

        scanner.close();
    }
}
