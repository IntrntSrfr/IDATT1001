import java.util.Scanner;

public class ClientMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person p1 = new Person("Deez", "Nuts", 1994);
        ArbTaker a1 = new ArbTaker(p1, 1, 2004, 100000, 0.3);


        while (true) {
            System.out.println("What do u wanna do?\n1. Edit first name\n2. Edit last name\n3. Edit salary\n4. Edit tax %\n5. Print worker info\n6. Exit");
            //int choice = 0;

            String inp = scan.nextLine();

            // 1 = setFirstName
            // 2 = setLastName
            // 3 = setSalary
            // 4 = setTaxPercent

            if (inp.equals("1")) {
                System.out.println("Set new first name:");
                String newName = scan.nextLine();
                if (newName.isBlank()) {
                    continue;
                }
                a1.setFirstName(newName);
                System.out.println(a1.getName());
            } else if (inp.equals("2")) {
                System.out.println("Set new last name:");
                String newName = scan.nextLine();
                if (newName.isBlank()) {
                    continue;
                }
                a1.setLastName(newName);
                System.out.println(a1.getName());
            } else if (inp.equals("3")) {
                System.out.println("Set new salary:");
                double newSalary = 0;
                try {
                    newSalary = Double.parseDouble(scan.nextLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                a1.setTaxPercent(newSalary);
                System.out.println(a1.getTaxPercent());
            } else if (inp.equals("4")) {
                System.out.println("Set new tax percent:");
                double newPercent = 0;
                try {
                    newPercent = Double.parseDouble(scan.nextLine());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                a1.setTaxPercent(newPercent);
                System.out.println(a1.getTaxPercent());
            } else if (inp.equals("5")) {
                System.out.println(a1.toString());
            } else if (inp.equals("6")) {
                break;
            }
        }
    }
}
