package core;

public class Vehicle {
    protected String type;
    protected int age;
    public Vehicle (String type, int age) {
        this.type=type;
        this.age=age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}
