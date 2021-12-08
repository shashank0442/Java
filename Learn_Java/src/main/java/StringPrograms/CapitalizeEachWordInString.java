package StringPrograms;

//Company- Pattern - Write a program to convert first letter of each work to upper case and remaining words in lower
public class CapitalizeEachWordInString {

    public static String capitalizeWord(String str) {
        str = str.toLowerCase();                                // Converting full string to lower Case
        String words[] = str.split("\\s");                // Convert String to Array
        String capatilizedWord = "";
        for (String word : words) {
            String firstLetterOfWord = word.substring(0, 1);           // Getting first letter of the word using substring function
            firstLetterOfWord = firstLetterOfWord.toUpperCase();
            String remainingWord = word.substring(1);                  // Getting remaining String from the word
            capatilizedWord += firstLetterOfWord + remainingWord + " ";// First Upper Case letter + remaining String + Space
        }
        return capatilizedWord;
    }

    public static void main(String[] args) {
        String str = "uNiTeD StatEs OF AmERICa";
        System.out.println(capitalizeWord(str));
    }
}