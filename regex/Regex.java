import java.util.regex.*;

class Regex {
    public static void main(String[] args) {
        String text = "http://patrick.com";

        Pattern pattern = Pattern.compile("^http://");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()){
            System.out.println("Found match at: "  + matcher.start() + " to " + matcher.end());
        }

        String text_two = "one two three two one";

        boolean matches = text_two.matches(".*two.*");
        System.out.println(matches);
    }
}