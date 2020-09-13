import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Valuta val1 = new Valuta("NOK", 1);
        Valuta val2 = new Valuta("EUR", 10.57);
        Valuta val3 = new Valuta("USD", 8.95);
        Valuta val4 = new Valuta("SEK", 1.025);

        while (true) {
            System.out.println("Choose a currency:\n1. EUR\n2. USD\n3. SEK\n4. Exit");

            String inp = scan.nextLine();

            Valuta choice = null;

            if (inp.equals("1")) {
                choice = val2;
            } else if (inp.equals("2")) {
                choice = val3;
            } else if (inp.equals("3")) {
                choice = val4;
            } else if (inp.equals("4")) {
                break;
            } else {
                continue;
            }

            while (true) {
                System.out.println(
                        String.format("\nConvert:\n1. From NOK to %1$s\n2. From %1$s to NOK\n3. Back", choice.getName()));

                String inp2 = scan.nextLine();

                int conversion = 0;
                if (inp2.equals("1")) {
                    conversion = 1;
                } else if (inp2.equals("2")) {
                    conversion = 2;
                } else if (inp2.equals("3")) {
                    break;
                } else {
                    continue;
                }

                while(true){
                    System.out.println("\nAmount to convert:\n\ntype 'back' to go back.");

                    String inp3 = scan.nextLine();
                    if(inp3.equals("back")){
                        break;
                    }

                    int amt;

                    try{
                        amt = Integer.parseInt(inp3);
                    }catch(NumberFormatException e){
                        continue;
                    }

                    if(conversion==1){
                        System.out.println(val1.convertTo(choice, amt));
                    }else if(conversion==2){
                        System.out.println(choice.convertTo(val1, amt));
                    }else{
                        continue;
                    }
                }
            }
            System.out.println(choice.getName());
        }

        scan.close();
    }
}