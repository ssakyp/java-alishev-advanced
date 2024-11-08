import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson16Iterable {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(23);
        list.add(98);
        list.add(103);

        // Before Java 5
        int idx = 0;
        Iterator<Integer> iterator = list.iterator();   // Interface during iterator we can change the list
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if(idx ==1)
                iterator.remove();      // deleting elements from linkedList is much more effective
            idx++;
        }
        // for each created in Java 5 during foreach we cannot change the list
//        for(int x : list)
//            System.out.println(x);
        System.out.println(list);

    }
}
