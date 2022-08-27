import java.util.Arrays;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {

        System.out.print("Min: -100, Max: 100");
        System.out.println("a) " + Arrays.toString(randomNums(-100, 100)));

        System.out.print("Enter min as integer: ");
        int min = Integer.parseInt(System.console().readLine());
        System.out.print("Enter max as integer: ");
        int max = Integer.parseInt(System.console().readLine());

        System.out.println("b) " + Arrays.toString(randomNums(min, max)));


        System.out.print("Min: 0.0, Max: 1.0");
        System.out.println("c) " + Arrays.toString(randomNums(0.0, 1.0)));


        System.out.print("Enter min as double: ");
        double minD = Double.parseDouble(System.console().readLine());
        System.out.print("Enter max as double: ");
        double maxD = Double.parseDouble(System.console().readLine());
        
        System.out.println("d) " + Arrays.toString(randomNums(minD, maxD)));
    }

    private static Integer[] randomNums(Integer min, Integer max, Integer count) {
        if (min > max) {
            System.out.println("Invalid range. min must be less than max.");
        }

        Random rand = new Random();
        Integer[] nums = new Integer[count];
        for (int i = 0; i < count; i++) {
            nums[i] = rand.nextInt(max - min + 1) + min;
        }
        return nums;
    }

    private static Integer[] randomNums(Integer max, Integer min) {
        return randomNums(max, min, 10);
    }

    private static Double[] randomNums(Double min, Double max, Integer count) {
        if (min > max) {
            System.out.println("Invalid range. min must be less than max.");
        }

        Random rand = new Random();
        Double[] nums = new Double[count];
        for (int i = 0; i < count; i++) {
            nums[i] = rand.nextDouble() * (max - min) + min;
        }
        return nums;
    }

    private static Double[] randomNums(Double max, Double min) {
        return randomNums(max, min, 10);
    }
}
