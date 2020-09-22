import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("first number:");
        a = Integer.parseInt(scan.nextLine());

        System.out.println("second number:");
        b = Integer.parseInt(scan.nextLine());

        scan.close();

        if (a > b) {
            System.out.println("a cannot be bigger than b");
            System.exit(0);
        }

        for (int i = a; i < b + 1; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(String.format("%s + %s = %s", i, j, i * j));
            }
            System.out.println(i);
        }
    }
}