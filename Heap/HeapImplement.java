package Heap;

import java.util.ArrayList;

public class HeapImplement {
    

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
                arr.add(data);

                int x = arr.size() -1 ;

                int par = (x-1)/2;

                while (arr.get(x) < arr.get(par)) {
                    
                    int temp = arr.get(x);
                    arr.set(x, arr.get(par));
                    arr.set(par, temp);
                    x=par;
                    par = (x-1) / 2;
                }
        }

        public int peek(){
            return arr.get(0);
        }


        public int remove(){
            int data = arr.get(0);

            // step 1 swap first and last 

            int temp = arr.get(0);
            arr.set(0 , arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);

            // step 2 delete last

            arr.remove(arr.size()-1);

            //step3 heapify

            heapify(0);
            return data;
        }

        private void heapify(int i){
            int left  = 2*i+1;
            int right = 2*i+2;

            int midIdx = i;

            if (left < arr.size() && arr.get(midIdx) > arr.get(left)) {
                midIdx = left;
            }

            if (right < arr.size() && arr.get(midIdx) > arr.get(right)) {
                midIdx = right;
            }

            if (midIdx !=i) {
                //swap

                int temp = arr.get(i);
                
                arr.set(i, arr.get(midIdx));
                arr.set(midIdx, temp);

                heapify(midIdx);
            }
        }

        public boolean isEmpty(){
            return arr.isEmpty();
        }

        public  void printHeap(){
            System.out.print("[ ");
            for (int i = 0; i < arr.size(); i++) {
               System.out.print(arr.get(i)+", ");
            }
            System.out.print(" ]");
        }

     
    }

    public static void main(String[] args) {
        
        Heap h = new Heap();

         h.add(3);
        h.add(4);
        h.add(1);
        h.add(7);

        h.printHeap();
        h.remove();
        h.printHeap();




    }
}
