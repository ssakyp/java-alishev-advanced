import java.util.LinkedList;
import java.util.List;

public class Lesson5 {
    public static void main(String[] args) {
        //ist<Integer> linkedList = new LinkedList<>();
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList.toString());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        linkedList.remove(1);
        System.out.println(linkedList);
    }
}
