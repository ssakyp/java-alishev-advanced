import java.util.*;

public class Lesson12 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("elephant");
        animals.add("as");
        animals.add("12fvdddddd");
        System.out.println(animals);
        Collections.sort(animals, new StringLengthComparator());  // sorts le
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(122);
        numbers.add(-12);
        numbers.add(77);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2){
                    return -1;
                } else if (o1 < o2){
                    return 1;
                } else{
                    return 0;
                }
            }
        });
        System.out.println(numbers);

        List<Person1> people = new ArrayList<>();
        people.add(new Person1(3, "Bob"));
        people.add(new Person1(2, "Jack"));
        people.add(new Person1(1, "Peter"));
        Collections.sort(people, new Comparator<Person1>() {
            @Override
            public int compare(Person1 o1, Person1 o2) {
                if(o1.getId() > o2.getId()){
                    return 1;
                } else if(o1.getId() < o2.getId()){
                    return -1;
                } else{
                    return 0;
                }
            }
        });
        System.out.println(people);

    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
       if(o1.length() > o2.length()){
           return 1;
       } else if (o1.length() < o2.length()){
           return -1;
       } else{
           return 0;
       }

        /*
        o1 > o2 => 1
        o1 < 02 => -1
        o1 == o1 => 0
        compare(2, 1) => 1
        compare(1, 2) => -1
        compare(1, 1) => 0
         */
    }
}

class BackwardsIntegerComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2){
            return -1;
        } else if(o1 < o2){
            return 1;
        } else{
            return 0;
        }
    }
}

class Person1{
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}