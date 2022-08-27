public class Ex3 {
    public static void main(String[] args) {
        System.out.println(isLeap(2000));
    }

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isLeap(String year) {
        if (!year.matches("[0-9]+")) {
            System.out.println("Invalid input");
            return false;
        }

        return isLeap(Integer.parseInt(year));
    }
}
