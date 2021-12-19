package T3H.opp.Class1;

import T3H.opp.Class1.Animal;

public class Cat extends Animal {
    private int age;
    private String color;

    public Cat() {
        age = 1;
        color = "red";
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Cat(int age){
        this.age = age;
    }

    public Cat(String color){
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return age*age*Math.PI;
    }

    @Override
    public String toString() {
        return "\nTuổi: " + getAge() + "\nMàu sắc: " + getColor();
    }

    public String Speak(){
        return "meo meo";
    }
}
