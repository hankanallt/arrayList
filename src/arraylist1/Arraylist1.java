package arraylist1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Arraylist1 {

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
        //List<String> list = new LinkedList<>();
        

        list.add("Hacke");
        list.add("Amar");
        list.add("Bobo");
        list.add("5");
        list.add("3");

        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.contains("Tulsi"));
        System.out.println(list.remove(1));
        System.out.println(list.toString());

        // Collections.sort(list(s1,s2)->s1.length() - s2.length()); 
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println(Collections.min(list));

//Iterator är en factory method.
        Iterator<String> it = list.iterator();
        while (it.hasNext());
        System.out.println(it.next());

        //man måste vara Iterable för att en List.
        for (String s : list) {
            System.out.println(s);
        }

        //for (int i = 0; i < list.size(); i++) {
        //  System.out.println(list.get(i));
    }
}
