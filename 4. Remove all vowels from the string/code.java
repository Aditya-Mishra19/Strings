import java.util.Scanner;

public class Main {
    public static String removeVowels(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("String after removing vowels: " + removeVowels(inputStr));
    }
}
