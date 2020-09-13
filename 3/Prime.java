import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            String inpString = scan.nextLine();
            if (inpString.equals("esc")) {
                break;
            }

            int num = Integer.parseInt(inpString);

            if (num == 0 || num == 1) {
                System.out.println(num + " is not a prime number");
                continue;
            }
            
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {

                System.out.println(num + " "  + i);
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime");
            } else {
                System.out.println(num + " is not a prime");
            }
        }
    }
}