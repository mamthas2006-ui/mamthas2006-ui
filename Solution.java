
// ...existing code...
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) {
            sc.close();
            return;
        }
        String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println();
            sc.close();
            return;
        }

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) result.append(" ");
        }

        System.out.println(result.toString());
        sc.close();
    }
}
// ...existing code...