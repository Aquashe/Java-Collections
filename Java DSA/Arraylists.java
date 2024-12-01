import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class Arraylists{
    public static void main(String[] args) {
        System.out.println("hello");

        List <Integer> alist1 = new ArrayList<>();
        alist1.add(1);
        alist1.add(2);
        alist1.add(3);   
        System.out.println(alist1);

        Iterator<Integer> iterator = alist1.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println("");
        for(int x:alist1)
            System.out.print(x+" ");
        System.out.println("");
        
        List <Integer> alist2 = new ArrayList<>(alist1);
        alist2.add(4);
        System.out.println("alist2 :" +alist2);
        System.out.println("alist1 :" +alist1);
        System.out.println("Set usage in Arraylist replaced element is :"+alist1.set(2, 100));
        System.out.println("alist1 :"+alist1);

        List <Integer> alist3 = new ArrayList<>(alist1);
        alist3.add(4);
        alist3.add(5);

        alist3.addAll(alist2);

        System.out.println("alist2 + alist3:"+alist3);

        //SUBLIST
        List <Integer> alist4 = alist3.subList(1, 4);
        System.out.println("alist4"+alist4);




        //CONVERSION ARRAYLIST TO ARRAY
        System.out.println("CONVERSION ARRAYLIST TO ARRAY");
        Object [] arr = alist1.toArray();
        for(Object obj: arr)
            System.out.println(obj);

        System.out.println(arr.getClass().getName());

        int [] arr1 = {1,2,34,5};
        System.out.println((Arrays.asList(arr1)).getClass().getName());

        //
    }
}