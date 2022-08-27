public class Ex2 {
    public static void main(String[] args) {
        RoundingTest(10.2);
        Double[] nums = { -100.1, 100.49, 100.5, -100.51, -100.9, 0.0, 100.1, 100.49, 100.5, 100.51, 100.9 };
        for (Double num : nums) {
            RoundingTest(num);
        }
    }

    private static void RoundingTest(double d) {
        System.out
                .println(String.format("For %4$.6f ceil = %1$.6f floor=%2$.6f round=%3$d", Math.ceil(d), Math.floor(d),
                        (int) Math.round(d), d));
    }
}
