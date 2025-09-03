import java.util.Scanner;

public class ManualTrimCompare {

    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') start++;
        while (end >= 0 && str.charAt(end) == ' ') end--;

        return new int[]{start, end + 1}; // end is exclusive
    }

    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] indices = findTrimIndices(text);
        String manualTrim = manualSubstring(text, indices[0], indices[1]);
        String builtInTrim = text.trim();

        System.out.println("Manual Trim: '" + manualTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Match: " + compareStrings(manualTrim, builtInTrim));
    }
}
