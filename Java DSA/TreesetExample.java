import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import thomas.*;
public class TreesetExample {
    public static void main(String[] args) {
        Set<StudentMarks > treeSet = new TreeSet<>((s1,s2)->{
            return s2.getPhysics() - s1.physics;
        });
        treeSet.add(new StudentMarks(70, 80));
        treeSet.add(new StudentMarks(60, 70));
        treeSet.add(new StudentMarks(90, 30));
        treeSet.add(new StudentMarks(50, 40));

        // for(StudentMarks x: treeSet)
        //     System.out.println(x);


        NavigableSet <Integer> set3  = new TreeSet<>();
        set3.add(2);
        set3.add(1);
        set3.add(4);
        set3.add(6);

        System.out.println("Floor :"+set3.floor(3));
        System.out.println("Higher :"+set3.higher(3));
        System.out.println("Lower :"+set3.lower(3));
        System.out.println("Ceil :"+set3.ceiling(3));//Element >= 3
    

    }
}
