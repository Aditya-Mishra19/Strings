import java.util.Scanner;

public class Main {
    public static int sumOfNumbers(String s) {
        int sum = 0;
        StringBuilder currentNum = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentNum.append(c);
            } else if (currentNum.length() > 0) {
                sum += Integer.parseInt(currentNum.toString());
                currentNum.setLength(0);
            }
        }

        if (currentNum.length() > 0) {
            sum += Integer.parseInt(currentNum.toString());
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(SySstem.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.println("Sum of numbers in the string: " + sumOfNumbers(inputStr));
    }
}
