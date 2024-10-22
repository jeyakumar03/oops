package university.students;

public class postgraduate extends student {
    private String researchtopic;

    public postgraduate(String name, int age, String researchtopic) {
        super(name, age);
        this.researchtopic = researchtopic;
    }

    @Override
    void display() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + getname());
        System.out.println("Age: " + getage());
        System.out.println("Research Topic: " + researchtopic);
    }
}

