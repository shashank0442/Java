package extraprograms;

//Capgimini Question : = Write a program which give count of all the unique character occurrence in the given string

import java.util.HashMap;
import java.util.Map;

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

    public static void getCharacterCountUsingMap(String str) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            String currentChar = Character.toString(str.charAt(i));
            for (int j = 0; j < str.length(); j++) {
                if (currentChar.contains(Character.toString(str.charAt(j)))) {
                    count++;
                }
            }
            map.put(currentChar, count);
            count = 0;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Value = " + entry.getValue() + "\t Count= " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        String str = "Shashank";
        getCharacterCount(str);
        System.out.println("*******************************************");
        getCharacterCountUsingMap(str);
    }
}