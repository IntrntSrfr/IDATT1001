public class Analyzer {

    String text;
    int[] charTally;

    public Analyzer(String text) {
        this.text = text;
        charTally = new int[30];

        for (int i = 0; i < text.length(); i++) {
            char ic = text.charAt(i);

            charTally[translateToIndex(ic)]++;

        }
        System.out.println();
    }

    public String getText(){
        return text;
    }

    public int[] getTally(){
        return charTally;
    }

    private int translateToIndex(char c) {
        if (65 <= c && c <= 90) {
            return c - 65;
        } else if (97 <= c && c <= 122) {
            return c - 97;
        } else {
            return charTally.length - 1;
        }
    }

    private int sum() {
        int l = 0;
        for (int count : charTally) {
            l += count;
        }
        return l;
    }

    public int uniqueLettersAmt() {
        int ul = 0;

        for (int i = 0; i < charTally.length - 1; i++) {
            if (charTally[i] != 0) {
                ul++;
            }
        }
        return ul;
    }

    public int lettersAmt() {
        int l = 0;

        for (int i = 0; i < charTally.length - 1; i++) {
            l += charTally[i];
        }

        return l;
    }

    public double percentNotLetters() {
        return Math.round((1 - (double) lettersAmt() / sum()) * 100);
    }

    public int count(char c) {
        return charTally[translateToIndex(c)];
    }

    public void mostFrequentLetters(){
        int max = 0;
        
        for (int i = 0; i < charTally.length - 1; i++) {
            if(charTally[i]>max){
                max=charTally[i];
            }
        }

        System.out.println("the most frequent characters are:");
        
        for (int i = 0; i < charTally.length - 1; i++) {
            if(charTally[i]==max){
                System.out.print((char)(65+i) + " ");
            }
        }
        System.out.println();
    }
}
