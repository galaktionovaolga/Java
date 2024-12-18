package _12_12_2024;

public class Example1 {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
        human1.department = "IT";
        human1.setAge(33);
    }
}

class Human1 {
    private int age;
    private String name;
    String department;
    //public, package private, protected, private


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}