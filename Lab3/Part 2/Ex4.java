import java.util.Calendar;
import java.util.Date;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(2, 2020));
    }

    public static int daysInMonth(int month, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.YEAR, year);

        return cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    public static int daysInMonth(String month, String year) {
        if (!month.matches("[0-9]+") || !year.matches("[0-9]+")) {
            System.out.println("Invalid input");
            return -1;
        }

        return daysInMonth(Integer.parseInt(month), Integer.parseInt(year));
    }
}