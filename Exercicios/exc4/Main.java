import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String fileName = scanner.nextLine();

        Pattern pattern = Pattern.compile("(\\w+)\\.(\\w+)");

        Matcher matcher = pattern.matcher(fileName);

        if(matcher.find()){
            System.out.println("Nome do arquivo sem extensão: " + matcher.group(1));
        } else{
            System.out.println("O arquivo não possui extensão.");
        }


        scanner.close();
    }
}
