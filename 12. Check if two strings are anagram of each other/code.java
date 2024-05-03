import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean areAnagrams(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String inputStr1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String inputStr2 = scanner.nextLine();
        System.out.println("Are the strings anagrams? " + areAnagrams(inputStr1, inputStr2));
    }
}
