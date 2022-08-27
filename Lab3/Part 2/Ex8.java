public class Ex8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abracadabra"));
        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome(""));
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public static String reverse(String ipx) {
        return new StringBuffer(ipx).reverse().toString();
    }
}