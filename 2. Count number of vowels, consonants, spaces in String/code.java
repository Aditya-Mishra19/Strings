import java.util.Scanner;

public class Main {
    public static void countCharacters(String s) {
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for (char c : s.toCharArray()) {
            if (Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'i' 
                S|| Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'u') {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            } else if (Character.isWhitespace(c)) {
                spaces++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + spaces);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        countCharacters(inputStr);
    }
}
