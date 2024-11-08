import java.util.HashMap;
import java.util.Map;

public class Lesson6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        // Dictionary
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);

        map.put(3, "Four");
        System.out.println(map);

        System.out.println(map.get(2));
        System.out.println(map.get(4));

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
