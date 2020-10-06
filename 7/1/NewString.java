public final class NewString {

    public static void main(String[] args) {
        String inp = "DENNE setningen kan FORKORTES      æøåæ ØÅÆ  ";

        NewString lol = new NewString(inp);
        System.out.println(lol.firstLetters());
        System.out.println(lol.removeLetter("n"));
    }

    final String text;

    public NewString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String firstLetters() {
        String s = "";
        for (String l : text.split(" ")) {
            if (l.length() > 0) {
                s += l.charAt(0);
            }
        }
        return s;
    }

    public String removeLetter(String c) {
        return text.replaceAll(c, "");
    }
}

