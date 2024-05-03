import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String givenStr = scanner.nextLine();
        if (isPalindrome(givenStr)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
