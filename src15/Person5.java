@Author(name = "Sultan", dateOfCreation = 2024)
public class Person5 {
    private int id;
    private String name;

    public Person5(){
        this.id = -1;
        this.name = "No name";
    }

    public Person5(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello World!");
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

    @Override
    public String toString() {
        return "Person5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
