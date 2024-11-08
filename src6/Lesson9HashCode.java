import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Lesson9HashCode {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(1, "Bob");

        map.put(person1, "123");
        map.put(person2, "123");

        set.add(person1);
        set.add(person2);
        System.out.println(map);
        System.out.println(set);

//        map.put(1, "Tom");
//        map.put(1, "Bob");
//        System.out.println(map);
//
//        boolean b = 1 == 2;
//
//        set.add(1);
//        set.add(1);
//        System.out.println(set);

    }
}

class Person{
    private int id;
    private String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }
}