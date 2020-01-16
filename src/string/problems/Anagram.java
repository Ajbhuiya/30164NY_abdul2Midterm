package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "CAT";
        String b = "ACT";
        String c = "ARMY";
        String d = "MARY";

        System.out.println(isitAnagram(a,b));

        System.out.println(isitAnagram(c,d));
    }
    public static boolean isitAnagram(String stringa, String stringb){

        if (stringa.length()!= stringb.length()){
            return false;
        }
        stringa = stringa.toUpperCase();
        stringb =  stringb.toUpperCase();

        char [] stringc = stringa.toCharArray();

        Arrays.sort(stringc);
        char [] stringd = stringb.toCharArray();

        Arrays.sort(stringd);

        return Arrays.equals(stringc, stringd);
    }

}
