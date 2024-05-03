import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Character, Integer> calculateFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        Map<Character, Integer> frequency = calculateFrequency(inputStr);
        System.out.println("Frequency of characters in the string:");
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue() + " ");
        }
    }
}
