import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String password = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%!]).{8,}$");
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches()){
            System.out.printf("A senha é válida.");
        } else {
            System.out.printf("A senha não é válida.");
        }

        scanner.close();
    }
}
