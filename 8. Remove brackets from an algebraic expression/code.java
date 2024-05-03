import java.util.Scanner;

public class Main {
    public static String solve(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == ')') {
                continue;
            }
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Result after removing parentheses: " + solve(inputStr));
    }
}
