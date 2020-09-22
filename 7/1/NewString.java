public final class NewString {

    public static void main(String[] args) {
        String inp = "DENNE setningen kan FORKORTES";


        System.out.println(new NewString(inp).firstLetters());
        System.out.println(new NewString(inp).removeLetter("n"));
    }

    final String text;

    public NewString(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String firstLetters() {
        StringBuilder sb = new StringBuilder();
        for (String l : text.split(" ")) {
            sb.append(l.charAt(0));
        }
        return sb.toString();
    }

    public String removeLetter(String c) {
        return text.replaceAll(c, "");
    }
}

