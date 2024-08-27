package TcsProlems;

public class DecimalToBinaryAndTogle {


    public static int convertToBinary(int no){



        int binary=0;
        int placeValue = 1;

        while (no != 0) {
            
            int rem = no%2;

            binary = binary + rem * placeValue;

            no /= 2;
            placeValue *= 10;

        }
        System.out.println(binary);
        return binary;
    }

    // public static int toggle(int no){

        


    // }

    public static void main(String[] args) {
        

        int decimal = 10;

        int binary = convertToBinary(decimal);

        System.out.println(binary);
        

    }
}
