import java.util.Scanner;

public class Main {
    public static void capitalize(StringBuilder str) {
        int size = str.length();
        for (int i = 0; i < size; i++) {
            if (i == 0 || i == (size - 1)) {
                if (Character.isLowerCase(str.charAt(i)))
                    str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else if (str.charAt(i) == ' ') {
                if (Character.isLowerCase(str.charAt(i - 1)))
                    str.setCharAt(i - 1, Character.toUpperCase(str.charAt(i - 1)));
                if (Character.isLowerCase(str.charAt(i + 1)))
                    str.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1)));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder str = new StringBuilder(scanner.nextLine());
        capitalize(str);
        System.out.println("String after capitalizing the first and last letter of each word: ");
        System.out.println(str);
    }
}
