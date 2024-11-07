import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        // [1] -> [2] -> [3] -> [4]
        List<Integer> arrayList = new ArrayList<>();
        measureTime(linkedList);
        measureTime(arrayList);







//        linkedList.add(1);
//        linkedList.get(2);
//        linkedList.size();
//        linkedList.remove(2);


    }

    private static void measureTime(List<Integer> list){

        // [] -> [0] -> [1][0] -> [2][1][0]
        // [] -> [0] -> [0][1] -> [0][1][2] => list.add(i)
        long start = System.currentTimeMillis();

//        for(int i = 0; i < 100000; i++){
//            list.get(i);
//        }
        for(int i = 0; i < 100000; i++){
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
