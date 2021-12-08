package StringPrograms;

//bijak interview question - How to reverse words in String
public class WordReverseInSentence {
    public static void main(String[] args) {
        String sentence = "My Name is Shashank";
        char character;
        String reversedWord = "", reversedString = "";
        String[] words = sentence.split("\\s");

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toString();
            for (int j = 0; j < word.length(); j++) {
                character = word.charAt(j);
                reversedWord = character + reversedWord;
            }
            reversedWord = reversedWord + " ";
            reversedString = reversedString + reversedWord;
            reversedWord = "";
        }
        System.out.println(reversedString);
    }
}
