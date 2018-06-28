package _01_bean;

public class Beam {
    private final String name;
    private final int age;

    public Beam(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
