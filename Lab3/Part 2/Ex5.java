public class Ex5 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(String n) {
        if (!n.matches("[0-9]+")) {
            System.out.println("Invalid input");
            return -1;
        }

        return factorial(Integer.parseInt(n));
    }

    public static int factorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }
}
