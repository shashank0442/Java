package extraprograms;

//Capgimini Question : = Write a program which give count of all the unique character occurrence in the given string

public class CharCountFromString {

    public static void getCharacterCount(String str) {
        int count = 0;
        char currentCharacter;
        String oldCharacters = "";
        boolean isUniqueCharacter = false;
        for (int i = 0; i < str.length(); i++) {
            currentCharacter = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                isUniqueCharacter = !oldCharacters.contains(Character.toString(currentCharacter));
                if (str.charAt(j) == currentCharacter && isUniqueCharacter) {
                    count++;
                }
            }
            if (isUniqueCharacter) {
                System.out.println("character value = " + currentCharacter + " Occourance  = " + count);
                oldCharacters = oldCharacters + Character.toString(currentCharacter);
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        getCharacterCount("Looooloooooovee");
    }
}