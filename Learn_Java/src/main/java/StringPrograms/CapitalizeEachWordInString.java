package StringPrograms;

import java.util.Locale;
//Company- Pattern - Write a program to convert first letter of each work to upper case and remaining words in lower
public class CapitalizeEachWordInString {

    public static String capitalizeWord(String str){
        str= str.toLowerCase(); // Converting full string to lower Case
        String words[]=str.split("\\s"); // Convert String to Array
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1); // Getting first letter of the word using substring function
            String afterfirst=w.substring(1); // Getting remaining String from the word
            capitalizeWord+=first.toUpperCase()+afterfirst+" "; // First Upper Case letter + remaining String + Space
        }
        return capitalizeWord.trim();
    }

    public static void main(String[] args) {
        String str ="uniTeD StatEs OF AmERICa";

        // in lower case all letters

        System.out.println(capitalizeWord(str));



        String str1 = "java";
        String name  = "sTacKoverflow";
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(name);

//        for(int i=0;i<str.length();i++){
//            if(i==0){
//                str.charAt(i);
//            }

        }

//            first character
//            if space >> then need to convert
        }


