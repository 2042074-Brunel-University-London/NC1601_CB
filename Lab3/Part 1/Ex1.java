import java.text.DecimalFormat;

public class Ex1 {
    public static void main(String[] args) {
        Double x = 123.456, y = 17.0 / 3.0, z = Math.sqrt(2);
        String a = "Hello", b = "World";

        DecimalFormat threeDP = new DecimalFormat("#.###");
        System.out.println("a) " + threeDP.format(y));

        String[] xS = x.toString().split("\\.");
        String[] yS = y.toString().split("\\.");
        String[] zS = z.toString().split("\\.");
        System.out.println("b) x: [" + xS[0].length() + ", " + xS[1].length() + "]");
        System.out.println("y: [" + yS[0].length() + ", " + yS[1].length() + "]");
        System.out.println("z: [" + zS[0].length() + ", " + zS[1].length() + "]");

        String c = new StringBuffer(a).reverse().toString().concat(" " + b);

        System.out.println("c) " + c);

        System.out.println("d) " + c.replace("ll", "ppp"));
    }
}
