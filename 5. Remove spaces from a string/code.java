import java.util.Scanner;

public class Main {
    public static String removeSpaces(String s) {
        return s.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("String after removing spaces: " + removeSpaces(inputStr));
    }
}
