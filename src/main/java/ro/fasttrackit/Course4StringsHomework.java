package ro.fasttrackit;

public class Course4StringsHomework {
    public static void main(String[] args) {
        System.out.println(countChar("test", 't'));
        System.out.println(redact("test"));

        String[] ana = {"Ana", "are", "mere"};
        System.out.println(contains(ana, "mere"));

        System.out.println(confidential("Ana are mere multe mere bune", new String[]{"mere", "Ana"}));
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static String redact(String word) {
        return "*".repeat(word.length());
    }

    public static boolean contains(String[] words, String str) {
        for (String word : words) {
            if (word.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String[] words(String phrase) {
        return phrase.split(" ");
    }

    public static String confidential(String phrase, String[] sensitiveWords) {
        String[] words = words(phrase);
        for (int i = 0; i < words.length; i++) {
            if (contains(sensitiveWords, words[i])) {
                words[i] = redact(words[i]);
            }
        }
        return String.join(" ", words);
    }

    public static void newMethod() {
        System.out.println("Hi");
    }
}
