class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class sample {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Hasib";
        p.age = 22;

        p.display();
    }
}

