public class PrimeNos {
    public static void main(String[] args) {

        int no = 15;

        if (no == 2) {
            System.out.println("Prime No");
        } else {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(no); i++) {

                if (no % i == 0) {
                    isPrime = false;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime == true) {
                System.out.println("No is Prime");
            } else {
                System.out.println("No is Not Prime");
            }

        }

    }
}
