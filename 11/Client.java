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
            System.out.println("""
                    1. Register Property
                    2. Print all properties
                    3. Search property by ..
                    4. Show total average area
                    5. Exit""");
            String inp = scan.nextLine();

            if(inp.equals("1")){
                int munNr, lotNr, secNr, area;
                String mun, name, owner;
            }else if(inp.equals("2")){
                reg.showAllProperties();
            }else if(inp.equals("3")){
                while(true){
                    System.out.println("""
                            1. Lot nr
                            2. Section nr
                            3. Mun. nr
                            4. All of the above
                            5. Back""");
                    String inp2 = scan.nextLine();
                    if(inp2.equals("1")){

                    }else if(inp2.equals("2")) {

                    }else if(inp2.equals("3")){

                    }else if(inp2.equals("4")){

                    }else if(inp2.equals("5")){
                        break;
                    }
                }
                // search by
            }else if(inp.equals("4")){
                System.out.println(reg.showTotalAverageArea());
            }else if(inp.equals("5")){
                break;
            }
        }
    }
}
