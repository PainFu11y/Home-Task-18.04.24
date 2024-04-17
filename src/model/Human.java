package model;

public class Human {
    private String name;
    private int age;

    @Override
    public String toString() {
        return name + " " + age;
    }
    public Human(String data){
        String [] split = data.split("[, ?:@]+");
        name = split[0];
        age = Integer.parseInt(split[1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
