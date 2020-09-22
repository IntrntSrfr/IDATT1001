import java.util.Scanner;

public class TextProcessing {
    private String text;

    public static void main(String[]args){

        while(true){
            Scanner scan = new Scanner(System.in);
            String inp = scan.nextLine();

            if(inp.equals("exit")){
                break;
            }

            TextProcessing tp = new TextProcessing(inp);

            System.out.println(tp.averageLength());
            System.out.println(tp.replaceWord("lol", "kek"));
            System.out.println(tp.getTextUppercase());
            System.out.println(tp.getLength());
        }
    }

    public TextProcessing(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String[] getWords(){
        return text.replaceAll("[.,:!?]", "").split(" ");
    }

    public int getLength() {
        return getWords().length;
    }

    public double averageLength(){
        double sum = 0;
        String[]list = getWords();
        for(String w :list){
            sum += w.length();
        }

        return sum/list.length;
    }

    public String replaceWord(String word1, String word2){
        return text.replaceAll(word1, word2 );
    }

    public String getTextUppercase(){
        return text.toUpperCase();
    }
}
