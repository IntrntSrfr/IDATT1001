import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CovidRegister covReg = new CovidRegister();

        // adding the test data from the exam page
        // I am not writing "NORGE" for Norway as shown in the exam set, because China is written in english,
        // so it would be inconsistent to write it in norwegian, while everything else is in english.
        covReg.registerEntry(new CovidData("CHINA", 136, 1, LocalDate.of(2020, 1, 19)));
        covReg.registerEntry(new CovidData("CHINA", 3872, 66, LocalDate.of(2020, 2, 5)));
        covReg.registerEntry(new CovidData("NORWAY", 3, 0, LocalDate.of(2020, 3, 7)));
        covReg.registerEntry(new CovidData("USA", 259, 4, LocalDate.of(2020, 3, 9)));
        covReg.registerEntry(new CovidData("CHINA", 45, 23, LocalDate.of(2020, 3, 9)));
        covReg.registerEntry(new CovidData("NORWAY", 240, 8, LocalDate.of(2020, 3, 22)));
        covReg.registerEntry(new CovidData("USA", 20341, 119, LocalDate.of(2020, 3, 24)));
        covReg.registerEntry(new CovidData("CHINA", 28, 4, LocalDate.of(2020, 3, 25)));
        covReg.registerEntry(new CovidData("NORWAY", 110, 3, LocalDate.of(2020, 4, 6)));
        covReg.registerEntry(new CovidData("USA", 30859, 2087, LocalDate.of(2020, 4, 10)));
        covReg.registerEntry(new CovidData("CHINA", 55, 1, LocalDate.of(2020, 4, 10)));

        while(true) {
            System.out.println("1. Register Covid Data\n2. Print all entries\n3. Get entry by date\n4. Get entries after date\n5. Get dead by country\n6. Exit");
            String inp = scan.nextLine();

            // this will only let you add entries for the current date.
            if (inp.equals("1")) {
                String country;
                int infected, dead;

                try{
                    System.out.println("Country:");
                    country = scan.nextLine();

                    System.out.println("Infected:");
                    inp = scan.nextLine();
                    infected = Integer.parseInt(inp);

                    System.out.println("Deaths:");
                    inp = scan.nextLine();
                    dead = Integer.parseInt(inp);

                    covReg.registerEntry(new CovidData(country, infected, dead, LocalDate.now()));
                }catch (Exception e){
                    System.out.println(e.getMessage()+"\n");
                    continue;
                }
                System.out.println("Entry successfully added\n");
            } else if (inp.equals("2")) {
                covReg.showAllEntries();
            } else if (inp.equals("3")) {
                System.out.println("Date on format 'dd/mm/yyyy':");
                inp = scan.nextLine();

                LocalDate d ;
                try{
                     d = LocalDate.parse(inp, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                }catch(Exception e){
                    System.out.println("Date poorly formatted");
                    continue;
                }

                CovidData entry = covReg.getFirstEntryByDate(d);
                if (entry==null){
                    System.out.println("No entries exist\n");
                    continue;
                }
                System.out.println(entry);

            } else if (inp.equals("4")) {
                System.out.println("Date on format 'dd/mm/yyyy':");
                inp = scan.nextLine();

                LocalDate d;
                try{
                    d = LocalDate.parse(inp, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                }catch(Exception e){
                    System.out.println("Date poorly formatted");
                    continue;
                }
                List<CovidData> entries = covReg.getEntriesAfterDate(d);
                if (entries.size()==0){
                    System.out.println("No entries\n");
                    continue;
                }
                entries.forEach(System.out::println);

            } else if (inp.equals("5")) {
                System.out.println("Country:");
                inp = scan.nextLine();
                System.out.printf("Total dead in %s: %d%n", inp, covReg.getDeadByCountry(inp));

            } else if (inp.equals("6")) {
                break;
            }
        }
    }
}



