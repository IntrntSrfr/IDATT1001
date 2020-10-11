import java.util.Scanner;

public class ClientMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person p1 = new Person("John", "Dee", 1994);
        ArbTaker a1 = new ArbTaker(p1, 1, 2004, 100000, 0.3);


        while (true) {
            //System.out.println("What do u wanna do?\n1. Edit first name\n2. Edit last name\n3. Edit salary\n4. Edit tax %\n5. Print worker info\n6. Exit");
            System.out.println("What do u wanna do?\n1. Edit salary\n2. Edit tax %\n3. Print worker info\n4. Exit");
            //int choice = 0;

            String inp = scan.nextLine();

            // 1 = setFirstName
            // 2 = setLastName
            // 3 = setSalary
            // 4 = setTaxPercent

             if (inp.equals("1")) {
                System.out.println("Set new salary:");
                double newSalary = 0;
                try {
                    newSalary = Double.parseDouble(scan.nextLine());
                    a1.setSalary(newSalary);
                    System.out.println(a1.getSalary());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (inp.equals("2")) {
                System.out.println("Set new tax percent:");
                double newPercent = 0;
                try {
                    newPercent = Double.parseDouble(scan.nextLine());
                    a1.setTaxPercent(newPercent);
                    System.out.println(a1.getTaxPercent());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (inp.equals("3")) {
                System.out.println(a1.toString());
            } else if (inp.equals("4")) {
                break;
            }
        }
    }
}
