package Hash;
import java.util.HashMap;
public class ValidAnagram {



    public static boolean isAnagram(String str , String str2){

        if (str.length() != str2.length()) {
            return false;
        }

        HashMap<Character , Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            map.put(ch,map.getOrDefault(ch, 0) +1);
        }

        for (int i = 0; i < str2.length(); i++) {
            
            char ch  = str2.charAt(i);

            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                }else{
                    map.put(ch, map.get(ch));
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        
        String s = "race";
        String s2 = "tulip";
        System.out.println(isAnagram(s, s2));
    }
}
