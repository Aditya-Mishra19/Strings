import java.util.Scanner;

public class Main {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Reversed string: " + reverseString(inputStr));
    }
}
