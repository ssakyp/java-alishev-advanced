import java.util.*;

public class Lesson13Comparable {
    public static void main(String[] args) {
        List<Person2> peopleList = new ArrayList<>();
        Set<Person2> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection){
        collection.add(new Person2(4, "Bobby"));
        collection.add(new Person2(3, "Jack"));
        collection.add(new Person2(1, "Steven"));
        collection.add(new Person2(2, "Sherlok"));
    }
}

class Person2 implements Comparable<Person2>{
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person2 person2 = (Person2) o;
        return id == person2.id && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        return result;
    }

    @Override
    public String toString() {
        return "Person2{" +
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

    @Override
    public int compareTo(Person2 o) {
//        if(this.id > o.getId()){
//            return 1;
//        } else if(this.id < o.getId()){
//            return -1;
//        } else {
//            return 0;
//        }
        if(this.name.length() > o.name.length()){
            return 1;
        } else if(this.name.length() < o.name.length()){
            return -1;
        } else {
            return 0;
        }
    }
}