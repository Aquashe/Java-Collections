import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import thomas.*;
public class Sets {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(3);
        aList.add(3);
        aList.add(4);
        aList.add(2);

        Set<Integer> aSet2 = new HashSet<>();
        aSet2.add(4);
        aSet2.add(5);
        Set<Integer> aSet = new HashSet<>(aList);
        System.out.println("aSet :"+aSet);
        System.out.println("aSet2 :"+aSet2);

        System.out.println("Set After retraining:");
        aSet.retainAll(aSet2);
        System.out.println("aset1"+aSet);
        System.out.println("aSet2 :"+aSet2);


        Set<Integer> aSet4= new HashSet<>();
        aSet4.add(4);
        aSet4.add(5);
        aSet4.add(1);
        aSet4.add(0);
        for(int x:aSet4)
            System.out.print(x+" ");

         System.out.println();   

         Set<Integer> aSet5= new LinkedHashSet<>();
         aSet5.add(4);
         aSet5.add(5);
         aSet5.add(1);
         aSet5.add(0);
         for(int x:aSet5)
             System.out.print(x+" ");
 
          System.out.println(); 

        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(38, 10));
        stMarks.add(new StudentMarks(100, 38));
        stMarks.add(new StudentMarks(40, 88));

        Set<StudentMarks> aSet6= new LinkedHashSet<>(stMarks);
        System.out.println(aSet6.contains(new StudentMarks(70, 80)));
        for(StudentMarks x :aSet6)
            System.out.println(x);


    }
}
