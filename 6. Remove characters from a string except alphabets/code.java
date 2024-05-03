import java.util.Scanner;

public class Main {
    public static String removeNonAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("String after removing non-alphabetic characters: " + removeNonAlphabets(inputStr));
    }
}
