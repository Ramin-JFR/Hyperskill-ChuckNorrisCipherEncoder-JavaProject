import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        boolean isSubstring = isAlphabetSubstring(input);
        System.out.println(isSubstring);
    }

    public static boolean isAlphabetSubstring(String str) {
        if (str.isEmpty())
            return true;

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] inputChars = str.toCharArray();

        Arrays.sort(inputChars);

        int startIndex = Arrays.binarySearch(alphabet, inputChars[0]);
        if (startIndex < 0)
            return false;

        for (int i = 0; i < inputChars.length; i++) {
            if (inputChars[i] != alphabet[startIndex + i])
                return false;
        }

        return true;
    }
}
