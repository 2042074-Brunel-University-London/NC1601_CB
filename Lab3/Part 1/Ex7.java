import java.util.ArrayList;

public class Ex7 {
    public static void main(String[] args) {
        System.out.print("Enter the list of words: ");
        String input = System.console().readLine();
        String[] words = input.split(" ");

        System.out.println("Longest Words: " + Longest_Word(words).toString().replace("[", "").replace("]", ""));
    }

    private static ArrayList<String> Longest_Word(String[] words) {
        ArrayList<String> longest_words = new ArrayList<String>();
        int max_length = 0;
        for (String word : words) {
            if (word.length() > max_length) {
                longest_words.clear();
                longest_words.add(word);
                max_length = word.length();
            } else if (word.length() == max_length) {
                longest_words.add(word);
            }
        }
        return longest_words;
    }
}