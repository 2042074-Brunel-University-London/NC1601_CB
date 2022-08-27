public class Ex6 {
    public static void main(String[] args) {
        System.out.println(charCount("abracadabra", 'a'));
    }

    // user
    public static int charCount(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
