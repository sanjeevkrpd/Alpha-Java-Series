package Heap;
// import java.util.Iterator;
// import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueueClass {

    
    static class Student implements Comparable<Student> {
    

        String name;
        int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student s2){
            return this.age - s2.age;
        }
    }

    public static void main(String[] args) {
        
        PriorityQueue<Student> pq = new PriorityQueue<>();
        //Comparator.reverseOrder()
        // pq.add(7);
        // pq.add(5);
        // pq.add(20);
        // pq.add(8);

        // System.out.println(pq);

        pq.add(new Student("Sonu kumar", 8));
        pq.add(new Student("Anshu kumar", 6));
        pq.add(new Student("Sanjeev kumar", 5));

            for (Student student : pq) {
                System.out.println(student.name + student.age);
            }
    }
}
