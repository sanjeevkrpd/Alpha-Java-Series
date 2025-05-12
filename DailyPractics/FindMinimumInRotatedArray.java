    package DailyPractics;

    public class FindMinimumInRotatedArray {

        public static int returnMinNumber(int arr[]) {
            int start = 0;
            int end = arr.length - 1;
    
           
            while (start < end) {
                
                int mid = start + (end - start) / 2;

                if (arr[mid] > arr[mid+1]) {
                    
                    start = mid + 1;
                }else{
                    end = mid;
                }
            }
            
            return arr[end];

        }
    
        public static void main(String[] args) {
            int arr[] = {3, 4, 5, 1, 2};
            System.out.println(returnMinNumber(arr)); 
        }
    }
    