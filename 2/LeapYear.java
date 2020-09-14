import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("give a year");

            String yearInp = scan.nextLine();

            if (yearInp.equals("esc")) {
                break;
            }

            int year = Integer.parseInt(yearInp);

            if (isLeap(year)) {
                System.out.println(yearInp + " is a leap year\n");
            } else {
                System.out.println(yearInp + " is a not leap year\n");
            }
        }
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}