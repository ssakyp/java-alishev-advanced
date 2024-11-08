import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson14Queue {
    public static void main(String[] args) {
        Person3 person1 = new Person3(1);
        Person3 person2 = new Person3(2);
        Person3 person3 = new Person3(3);
        Person3 person4 = new Person3(4);

        Queue<Person3> people = new ArrayBlockingQueue<>(3);    //size of queue
        people.add(person1);
        people.add(person3);
        people.add(person2);
        people.offer(person4);

        // person1 -> person3 -> person2 -> person4
//        for(Person3 person : people)
//            System.out.println(person);
        System.out.println(people.peek());
        System.out.println(people);

    }
}

class Person3{
    private int id;

    public Person3(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }
}
