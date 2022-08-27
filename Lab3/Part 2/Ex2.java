public class Ex2 {
    public static void main(String[] args) {
        System.out.println(reverse("desserts"));
    }

    public static String reverse(String ipx) {
        return new StringBuffer(ipx).reverse().toString();
    }
}
