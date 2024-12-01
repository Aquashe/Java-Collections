import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import thomas.*;
public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> mapi = new HashMap<>();
        mapi.put("rishi", 1);
        mapi.put("Chandler", 3);
        mapi.put("Bing", 6);
        
        //System.out.println(mapi.get("Bing"));
        //System.out.println(mapi.getOrDefault("dece", 0));
        //System.out.println(mapi.containsKey("Bing"));

        //Ajacency List concept for example 

        Map<Integer,List<Integer >> adj = new HashMap<>();

        Set<Map.Entry<String,Integer>> entrySet = mapi.entrySet();
        for(Map.Entry<String,Integer> x : entrySet)
            System.out.println(x.getKey()+" : "+x.getValue());


            System.out.println("Print using keySet() ");    
        Set<String> keSet = mapi.keySet();
        for(String key:keSet)
            System.out.println(key+" : "+ mapi.get(key));


        adj.computeIfAbsent(1,f-> new ArrayList<>()).add(2);
        adj.computeIfAbsent(2,f-> new ArrayList<>()).add(3);
        System.out.println("adj" +adj);    


        NavigableMap<Integer,String> tmap = new TreeMap<>((a,b) -> b-a);
        tmap.put(1, "Bing");
        tmap.put(6, "Chandler");

        System.out.println("TreeMap : "+ tmap);

    }
    
}
