import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("#(\\w+)");
        Matcher matcher = pattern.matcher(text);

        ArrayList<String> listOsHashtags = new ArrayList<>();

        while (matcher.find()){
            listOsHashtags.add(matcher.group());
        }

        if(listOsHashtags.isEmpty()){
            System.out.printf("Nenhuma Hashtags foi encontrada.");
        } else {
            System.out.printf("Hashtags encontradas: " + String.join(", ", listOsHashtags));
        }

        scanner.close();
    }
}
