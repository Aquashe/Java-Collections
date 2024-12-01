import java.util.ArrayList;
import java.util.List;
import thomas.*;
public class PriorityQueue {
    public static void main(String[] args) {

        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(38, 10));
        stMarks.add(new StudentMarks(100, 38));
        stMarks.add(new StudentMarks(40, 88));

        java.util.PriorityQueue <StudentMarks > spq = new java.util.PriorityQueue<>(stMarks);
        //Prints the top3 elements
        List<StudentMarks> top3 = new ArrayList<>();
        int index=0;
        while(!spq.isEmpty()){
            if(index==3)
                break;
            top3.add(spq.poll());
            index++;
        }
        //System.out.println(top3);

        /*When My Priority Queue is following Its NATURAL ORDERING
        but when my priority queue is following MyCustomComparator Its TOTAL ORDERING*/

        //java.util.PriorityQueue <Integer> priorityIntegers = new java.util.PriorityQueue<>(new MyCustomComparator()); - passing class

        java.util.PriorityQueue <Integer> priorityIntegers = new java.util.PriorityQueue<>((a,b) -> b-a);
        priorityIntegers.add(1);
        priorityIntegers.add(5);
        priorityIntegers.add(3);
        priorityIntegers.add(2);

        // System.out.println(priorityIntegers);


        java.util.PriorityQueue <StudentMarks> stPriorityMarks = new java.util.PriorityQueue<>((s1,s2) ->{
            System.out.println("Comparator is called");
            return s2.physics - s1.getPhysics();
        });

        for(StudentMarks x : stMarks)
            stPriorityMarks.add(x);


        System.out.println(stPriorityMarks);
    }
}
