import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        PropertyRegister reg = new PropertyRegister();

        reg.RegisterProperty(new Property(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen"));
        reg.RegisterProperty(new Property(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        reg.RegisterProperty(new Property(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        reg.RegisterProperty(new Property(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        reg.RegisterProperty(new Property(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

        while(true){
            System.out.println("1. Register Property\n2. Print all properties\n3. Search property by ..\n" +
                    "4. Show total average area\n5. Exit");
            String inp = scan.nextLine();

            if(inp.equals("1")){
                int munNr, lotNr, secNr, area;
                String mun, name, owner;
            }else if(inp.equals("2")){
                reg.ShowAllProperties();
            }else if(inp.equals("3")){
                // search by
            }else if(inp.equals("4")){
                System.out.println(reg.ShowTotalAverageArea());

            }else if(inp.equals("5")){
                break;
            }
        }
    }
}
