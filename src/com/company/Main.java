package com.company;

class Animal{
    String name;
    String age;
    String weight;

    public Animal(String name, String age, String weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    void eat(){

    }
    void getVoice(){

    }
}
class Mammal extends Animal{
    String furColor;

    public Mammal(String name, String age, String weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", furColor='" + furColor + '\'' +
                '}';
    }
    //void
}
class Bird extends Animal{
    String featherColor;

    public Bird(String name, String age, String weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", featherColor='" + featherColor + '\'' +
                '}';
    }
}
class Fish extends Animal{
    String scalesColor;

    public Fish(String name, String age, String weight, String scalesColor) {
        super(name, age, weight);
        this.scalesColor =  scalesColor;
    }

    public String getScalesColor() {
        return scalesColor;
    }

    public void setScalesColor(String scalesColor) {
        this.scalesColor = scalesColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", weight='" + weight + '\'' +
                ", scalesColor='" + scalesColor + '\'' +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
