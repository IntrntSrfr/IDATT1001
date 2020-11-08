import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PropertyRegister reg = new PropertyRegister();

        reg.registerProperty(new Property(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen"));
        reg.registerProperty(new Property(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        reg.registerProperty(new Property(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        reg.registerProperty(new Property(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        reg.registerProperty(new Property(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

        while(true){
            System.out.println("1. Register Property\n2. Print all properties\n3. Search property\n4. Show total average area\n5. Exit");
            String inp = scan.nextLine();

            if(inp.equals("1")){
                int munNr=0, lotNr=0, secNr=0;
                double area = 0.0;
                String mun="", name="", owner="";

                try{
                    System.out.println("Municipality number:");
                    inp = scan.nextLine();
                    munNr = Integer.parseInt(inp);

                    System.out.println("Municipality name:");
                    inp = scan.nextLine();
                    mun = inp;

                    System.out.println("Lot number:");
                    inp = scan.nextLine();
                    lotNr = Integer.parseInt(inp);

                    System.out.println("Section number:");
                    inp = scan.nextLine();
                    secNr = Integer.parseInt(inp);

                    System.out.println("Property name:");
                    inp = scan.nextLine();
                    name = inp;

                    System.out.println("Area (decimals allowed):");
                    inp = scan.nextLine();
                    area = Double.parseDouble(inp);

                    System.out.println("Owner name:");
                    inp = scan.nextLine();
                    owner = inp;
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }
                reg.registerProperty(new Property(munNr, mun, lotNr, secNr, name, area, owner));


            }else if(inp.equals("2")){
                reg.showAllProperties();
            }else if(inp.equals("3")){
                int munNr = 0, lotNr=0, secNr=0;

                try{
                    System.out.println("Municipality number:");
                    inp = scan.nextLine();
                    munNr = Integer.parseInt(inp);

                    System.out.println("Lot number:");
                    inp = scan.nextLine();
                    lotNr = Integer.parseInt(inp);

                    System.out.println("Section number:");
                    inp = scan.nextLine();
                    secNr = Integer.parseInt(inp);
                }catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }

                Property p = reg.getPropertyByInfo(munNr, lotNr, secNr);
                if (p == null) {
                    System.out.println("No property found");
                    continue;
                }
                System.out.println(p.toString());

            }else if(inp.equals("4")){
                System.out.println(reg.getTotalAverageArea());
            }else if(inp.equals("5")){
                break;
            }
        }
    }
}
