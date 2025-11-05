package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");
        String helloWorld2 = "%s %s".formatted("Hello", "World");
        System.out.println("Using string's formatted method: " + helloWorld);
        System.out.println("Using String.format: " + helloWorld2);

        String helloWorld3 = Main.format("%s %s", "Hello", "World");
        System.out.println("Using Main.format: " + helloWorld3);

        String testString = "Anyone can Learn abc's, 123's, and any regular expression";
        String replacement = "(-)";

        String[] patterns = {
                "abc",
                "123",
                "A",
                "[abc]",
                "[123]",
                "[A]",
                "a|b|c",
                "[a-z]",
                "[0-9]",
                "[A-Z]",
                "[a-zA-Z]",
                "[a-zA-Z]*",
                "[0-9]*",
                "[A-Z]*",
                "[0-9]+",
                "[0-9]{2}+",
                "[a-zA-Z]*$",
                "^[a-zA-Z]{3}",
                "[aA]ny\\b",
        };

        for (String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern: " + pattern + " => " + output);
        }
    }

    private static String format(String regexp, String... args) {

        int index = 0;
        while (regexp.matches(".*%s.*")) {
            regexp = regexp.replaceFirst("%s", args[index++]);
        }
        return regexp;
    }
}
