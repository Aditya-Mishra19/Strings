import java.util.Scanner;

public class Main {
    public static int asciiValue(char c) {
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        System.out.println("ASCII value: " + asciiValue(inputChar));
    }
}
