import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson8 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();  // no order faster than others
        Set<Integer> linkedHashSet = new LinkedHashSet<>();  // order by adding
        Set<Integer> treeSet = new TreeSet<>();  // naturally sorted a < b < c || aa < ab
        //testSet(hashSet);
//        System.out.println(hashSet.contains("Tom"));
//        System.out.println(hashSet.isEmpty());
//        System.out.println(hashSet);
        // union
        addNum(hashSet, 6, 0);
        addNum(linkedHashSet, 8, 2);
        addNum(treeSet, 11, 0);
        Set<Integer> union = new HashSet<>(hashSet);
        union.addAll(linkedHashSet);
        System.out.println(union);

        // intersection of set
        Set<Integer> intersection = new HashSet<>(hashSet);
        intersection.retainAll(linkedHashSet);
        System.out.println(intersection);

        // difference
        Set<Integer> difference = new HashSet<>(hashSet);
        difference.removeAll(linkedHashSet);
        System.out.println(difference);



    }

    public static void testSet(Set<String> set){
        set.add("Tom");
        set.add("Bob");
        set.add("John");
        set.add("Stephan");
        set.add("George");
        set.add("Bob");
        for(String name : set){
            System.out.println(name);
        }
    }

    public static void addNum(Set<Integer> set, int x, int y){
        for (int i = y; i < x; i++){
            set.add(i);
        }
    }
}
