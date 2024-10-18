package BackTracking;

public class SubString {

    public static void printSubset(String s , String ans, int i){
        if(i == s.length()){
            
            if (ans.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }

            return;
        }

        // yes choice
        printSubset(s, ans+s.charAt(i), i+1);

        // no choice
        printSubset(s, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";


        printSubset(str, "", 0);
    }
}
