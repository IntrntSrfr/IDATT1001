public class TextProcessing {
    private final String text;

    public static void main(String[] args) {
        TextProcessing tp1 = new TextProcessing("Hey what is up, gamers it's me! lololl! kek#:");
        //TextProcessing tp1 = new TextProcessing("kekz sto!!! mp");

        System.out.println(tp1.getAmtWords());
        System.out.println(tp1.getAvgWordLength());
        System.out.println(tp1.getWords()[1].length());
        System.out.println(tp1.getAvgWordsPerPeriod());
        System.out.println(tp1.replaceWord("gamers", "omegalol"));
        System.out.println(tp1.getText());
        System.out.println(tp1.getTextUppercase());
    }

    public TextProcessing(String text) {
        this.text = text;
    }

    public String[] getWords() {
        return text.replaceAll("[.,:!?]+", "").split(" ");
    }

    public int getAmtWords() {
        return getWords().length;
    }

    public double getAvgWordLength() {
        double sum = 0;
        for (String s : getWords()) {
            sum += s.length();
        }
        return sum / getAmtWords();
    }

    public String[] getPeriods() {
        return text.split("[!?:.,]+");
    }

    public double getAvgWordsPerPeriod() {
        double sum = 0;
        String[] periods = getPeriods();
        for (String s : periods) {
            sum += s.trim().split(" ").length;
        }
        return sum / periods.length;
    }

    public String replaceWord(String word1, String word2) {
        return text.replaceAll(word1, word2);
    }

    public String getText() {
        return text;
    }

    public String getTextUppercase() {
        return text.toUpperCase();
    }
}
