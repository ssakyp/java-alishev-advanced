import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lesson7 {
    public static void main(String[] args) {
//        Map<String, String> translations = new HashMap<>();
//        translations.put("cat", "кошка");
//        translations.put("dog", "собака");
//        translations.put("elephant", "слон");
//        for(Map.Entry<String, String> entry : translations.entrySet()){
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        Map<Integer, String> hashMap = new HashMap<>(); // no order in it

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // ordered by adding
        Map<Integer, String> treeMap = new TreeMap<>(); // sorted by key (natural order)
        testMap(treeMap);

    }
    public static void testMap(Map<Integer, String> map){
        map.put(23, "Bob");
        map.put(65, "Tom");
        map.put(43, "Jack");
        map.put(0, "Evert");
        map.put(1500, "John");
        map.put(7, "Ronald");
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}