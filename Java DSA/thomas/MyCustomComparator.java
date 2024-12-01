package thomas;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
    
}
