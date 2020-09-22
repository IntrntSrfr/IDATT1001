public class Analyzer {
    private String text;
    private int[] charTally;

    public Analyzer(String text) {
        this.text = text;
        this.charTally = new int[30];

        for (int i = 0; i < text.length(); i++) {
            char ic = text.charAt(i);

            if (ic == 'æ' || ic == 'Æ') {
                charTally[charTally.length - 4]++;
            } else if
            (ic == 'ø' || ic == 'Ø') {
                charTally[charTally.length - 3]++;
            } else if (ic
                    == 'å' || ic == 'Å') {
                charTally[charTally.length - 2]++;
            } else {
                charTally[translateToIndex(ic)]++;
            }

            //charTally[translateToIndex(ic)]++;

        }
        System.out.println();
    }

    public String getText() {
        return text;
    }

    public int[] getTally() {
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

    public void mostFrequentLetters() {
        int max = 0;

        for (int i = 0; i < charTally.length - 1; i++) {
            if (charTally[i] > max) {
                max = charTally[i];
            }
        }

        System.out.println("the most frequent characters are:");

        for (int i = 0; i < charTally.length - 1; i++) {
            if (charTally[i] == max && charTally[i] != 0) {
                if (i == charTally.length - 4) {
                    System.out.print("Æ");
                } else if (i == charTally.length - 3) {
                    System.out.print("Ø");
                } else if (i == charTally.length - 2) {
                    System.out.print("Å");
                } else {
                    System.out.print((char) (65 + i) + " ");
                }
            }
        }
        System.out.println();
    }
}
