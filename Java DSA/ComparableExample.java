import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {

    public static class Student implements Comparable<Student>{
        int  age;
        String name;
        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public String toString() {
            return "Student [age=" + age + ", name=" + name + "]";
        }
        @Override
        public int compareTo(Student that) {
            
            if(this.age>that.age)
                return 1;
            else 
                return -1;
        }
    }
    public static void main(String[] args) {

        // Comparator<Student > com = new Comparator<>() {
        //     public int compare(Student  i, Student j){
        //         if(i.age>j.age)
        //             return 1;
        //         else 
        //             return -1;
        //     }
        // };

        Comparator<Student > com =(i,j)-> i.age > j.age? 1:-1;


        Comparator <String> com2 = new Comparator<String>() {
            public int compare(String s1 , String s2){
                if(s1.length() > s2.length())
                    return 1;
                else 
                    return -1;
            }
        };

        List<String> arr2 =new ArrayList<>();
        arr2.add("haruy");
        arr2.add("jkbdcdc");
        arr2.add("dkmc");
        arr2.add("dcd");
        Collections.sort(arr2, com2);
        System.out.println(arr2);



        List<Student> arr =new ArrayList<>();
        arr.add(new Student(21, "Hari"));
        arr.add(new Student(32, "Ramu"));
        arr.add(new Student(23, "John"));
        //Collections.sort(arr, com);
        Collections.sort(arr);

        for(Student s : arr)
            System.out.println(s);



    }
}
