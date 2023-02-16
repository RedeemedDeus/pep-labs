import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer> charcount = new HashMap<Character,Integer>();

        for(int x = 0; x < str.length(); x++){
            char letter = str.charAt(x);
            int count = 0;

            for(int y = 0; y < str.length(); y++){
                if(str.charAt(x) == str.charAt(y)){
                    count++;
                }
            }

            charcount.put(letter, count);
        }

        char letter = '!';
        int count = 0;

        for(Map.Entry<Character, Integer> set: charcount.entrySet()){
            if(set.getValue() > count){
                count = set.getValue();
                letter = set.getKey();
            }
        }

        return letter;
    }
}
