import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String text = scanner.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String oldWord = scanner.nextLine();

        System.out.println("Digite a nova palavra: ");
        String newWord = scanner.nextLine();

        changeTheWord(text, oldWord, newWord);

        scanner.close();
    }

    public static void changeTheWord(String text, String oldWord, String newWord){
        if(validateWord(text, oldWord)){
            text = text.replace(oldWord, newWord);
            System.out.println("Texto modificado: " + text);
        } else{
            System.out.println("A palavra não está no texto.");
        }
    }

    public static boolean validateWord(String text, String word){
        if(text.contains(word)){
            return true;
        } else {
            return false;
        }
    }
}
