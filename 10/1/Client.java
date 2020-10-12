import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        EventRegister er = new EventRegister();

        er.registerEvent(new Event(202104201600L, "TG 2021", "Hamar", "TG", "LAN Party"));
        er.registerEvent(new Event(202004201600L, "TG 2020", "Hamar", "TG", "LAN Party"));
        er.registerEvent(new Event(201904201600L, "TG 2019", "Hamar", "TG", "LAN Party"));
        er.registerEvent(new Event(201804201600L, "TG 2018", "Hamar", "TG", "LAN Party"));
        er.registerEvent(new Event(201801031600L, "Allsang på grensa", "Grensa", "Allsang folka", "Festival"));
        er.registerEvent(new Event(202010311800L, "Halloween", "Norge", "Alle mann", "Feiring"));

        while (true) {
            System.out.println("1. Register new event\n2. Get events at location\n3. Get events at date\n" +
                    "4. Get events between dates\n5. Get events sorted by ...\n6. Exit");

            String inp = scan.nextLine();

            if (inp.equals("1")) {
                // register event menu

                String dateStr;//, name = "", location = "", arranger = "", type = "";
                long date;

                System.out.println("Date in format YYYYMMDDHHMM:");
                dateStr = scan.nextLine();

                try {
                    date = Long.parseLong(dateStr);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    continue;
                }

                String[] queries = {"Name of event:", "Location:", "Arranger:", "Type:"};

                // Important to remember the order
                // Name, Location, Arranger, Type
                String[] inputs = new String[4];

                for (int i = 0; i < queries.length; i++) {
                    while (true) {
                        System.out.println(queries[i]);
                        String curInp = scan.nextLine();
                        if (curInp.isBlank()) {
                            continue;
                        }
                        inputs[i] = curInp;
                        break;
                    }
                }

                if (er.registerEvent(new Event(date, inputs[0], inputs[1], inputs[2], inputs[3]))) {
                    System.out.printf("Event '%s' registered successfully.%n", inputs[0]);
                    continue;
                }
                System.out.println("Could not register event.");
            } else if (inp.equals("2")) {
                String location = scan.nextLine();
                System.out.println(er.getEventsByLocation(location));
            } else if (inp.equals("3")) {
                System.out.println("Date in format YYYYMMDD");
                long date;
                try {
                    date = Long.parseLong(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.println(er.getEventsByDate(date));
            } else if (inp.equals("4")) {
                long date1, date2;
                try {
                    System.out.println("Start date in format YYYYMMDD");
                    date1 = Long.parseLong(scan.nextLine());
                    System.out.println("End date in format YYYYMMDD");
                    date2 = Long.parseLong(scan.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
                System.out.println(er.getEventsBetweenDates(date1, date2));
            } else if (inp.equals("5")) {
                while (true) {
                    System.out.println("1. Date\n2. Location\n3. Type\n4. Back");
                    String inp2 = scan.nextLine();

                    if (inp2.equals("1")) {
                        System.out.println(er.getEventsSortedByDate());
                    } else if (inp2.equals("2")) {
                        System.out.println(er.getEventsSortedByLocation());
                    } else if (inp2.equals("3")) {
                        System.out.println(er.getEventsSortedByType());
                    } else if (inp2.equals("4")) {
                        break;
                    }
                }
            } else if (inp.equals("6")) {
                break;
            }
        }
    }
}
