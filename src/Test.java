import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//Java Collections Framework
public class Test {
    public static void main(String[] args) {
//        int[] x = new int[3];
//        for(int i = 0; i < x.length; i++){
//            x[i] = i;
//        }
        // Convention is to reference it to an interface List<>
        //ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            list.add(i);
        }
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(9));
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        // not efficient removing an item in the middle
        list.remove(5);    // [1, 2, 4, 5]

        // for each
        for(Integer x : list){
            System.out.println(x);
        }

        // if we remove a lot of items then we reference it to Linked List
        list = new LinkedList<>();
    }
}
