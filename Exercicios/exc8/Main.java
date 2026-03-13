import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF: ");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})-([0-9]{2})");
        //outra maneira: Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.find()){
            System.out.printf("O CPF está no formato válido.");
        }else {
            System.out.printf("O CPF não está no formato válido.");
        }
        scanner.close();
    }
}
