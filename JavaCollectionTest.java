import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class JavaCollectionTest {
    public static void main(String args[]){
       List<Integer> list=new ArrayList();
       list.add(1);
       list.add(2);

      for (Integer o : list) {
        System.out.println(o); 
       }

    LinkedList linkedlist=new LinkedList();
    linkedlist.add(3);
    linkedlist.add(4);
    linkedlist.add(5);

    for (Object obj : linkedlist) {
        System.out.println(obj);
        }
        
    Set<Integer> set=new HashSet();
        set.add(1);
        set.add(2);
        System.out.println(set);

       Map map = new HashMap();
       map.put(1,"vijay");
       map.put(2,"kavi");
       
        for (Object a : map.keySet() ) {
            System.out.println(map.get(a));
        }
    }
}