@Author(name = "Sultan", dateOfCreation = 2024)
public class Person4 {
    private int id;
    private String name;

    public Person4(){
        this.id = -1;
        this.name = "No name";
    }

    public Person4(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Person with id: " + id + " and name: " + name + " says hello!");
    }
}
