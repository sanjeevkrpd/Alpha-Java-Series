package LeetCodeProblems;

public class ZigZagPattern {

    public static void convert(String s, int numRows) {

            int fstMaxLength = 4;
            int secMaxLength = 7;
            int start = 0;

            System.out.println();
            System.out.println();
            for (int i = 0; i < numRows; i++) {

                printWithSpace(s , start , fstMaxLength);
                start = fstMaxLength;
                System.out.println();
                secMaxLength = secMaxLength+start;
                printWithoutSpace(s , start , secMaxLength);
                start = secMaxLength;
                fstMaxLength=fstMaxLength+start;
                System.out.println();
            }

           
    }

    public static void printWithSpace(String s, int start, int fstMaxLength) {

        if ( start >= s.length()) {
            return;
            
        }

        for (int i = start; i < fstMaxLength; i++) {
            if (i >= s.length()) {
                return;
            }

            System.out.print(s.charAt(i)+"   ");
        }
        }

        public static void printWithoutSpace(String s, int start, int fstMaxLength) {

            if (start >= s.length()) {
                return;

            }
            for (int i = start; i < fstMaxLength; i++) {

                if (i >= s.length()) {
                    return;
                }

                System.out.print(s.charAt(i)+" ");
            }
        }

    public static void main(String[] args) {
        
        convert("PAHNAPLSIIGYIR", 3);
    }
}
