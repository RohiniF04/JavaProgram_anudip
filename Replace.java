public class ReplaceSpaces {
    public static void main(String[] args) {
        String sentence = "This is Java Class by Anudip";
        String result = replaceSpaces(sentence);
        System.out.println(result);  
    }

    public static String replaceSpaces(String input) {
        
        return input.replaceAll("\\s+", "#");
    }
}
