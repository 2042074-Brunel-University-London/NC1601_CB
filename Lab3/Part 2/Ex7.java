import java.math.BigInteger;

public class Ex7 {
    public static void main(String[] args) {
        System.out.println(recFactorial(60));
    }

    public static BigInteger recFactorial(String n) {

        return recFactorial(Integer.parseInt(n));
    }

    public static BigInteger recFactorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(recFactorial(n - 1));
    }
}
