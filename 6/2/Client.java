import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            String inp = scan.nextLine();
            if (inp.equals("exit")) {
                exit = true;
                break;
            }

            Analyzer a = new Analyzer(inp);

            System.out.println("Total letters: "+a.lettersAmt());
            System.out.println("Unique letters: "+a.uniqueLettersAmt());
            System.out.println("Percentage of text not letters: "+a.percentNotLetters() + "%");
            System.out.println("Amount of times the letter 'l' occurs: "+a.count('l'));
            a.mostFrequentLetters();
        }
    }
}
