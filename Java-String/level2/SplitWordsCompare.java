import java.util.Scanner;

public class SplitWordsCompare {

    public static String[] manualSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[wordIndex++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manual = manualSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Manual Split:");
        for (String word : manual) System.out.println(word);

        System.out.println("Built-in Split:");
        for (String word : builtIn) System.out.println(word);

        System.out.println("Match: " + compareArrays(manual, builtIn));
    }
}
