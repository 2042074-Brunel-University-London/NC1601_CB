
public class Ex1 {
    public static void main(String[] args) {
        int i;
        boolean result;
        String s = "";

        for (i = 1; i <= 25; i++) {
            result = EvenOdd(i);
            s = (result) ? "Even" : "Odd";
            System.out.println(i + " is " + s);
        }
    }

    public static boolean EvenOdd(int x) {
        return (x % 2 == 0);
    }
}