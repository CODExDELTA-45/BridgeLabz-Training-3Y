import java.util.Scanner;

public class ShortestLongestWord {

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

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static void findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        int minLen = getLength(words[0]), maxLen = getLength(words[0]);

        for (String word : words) {
            int len = getLength(word);
            if (len < minLen) {
                minLen = len;
                shortest = word;
            }
            if (len > maxLen) {
                maxLen = len;
                longest = word;
            }
        }

        System.out.println("Shortest Word: " + shortest + " (" + minLen + ")");
        System.out.println("Longest Word: " + longest + " (" + maxLen + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        findShortestLongest(words);
    }
}
