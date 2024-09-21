package com.brennan;

public class Test {
    public static void main(String[] args) {
        Person p;
        Student s;
        s = new Student("Joe Smith", 20, "CS");
        p = s;
        System.out.println(p.getAge());
        s.setAge(11);
        System.out.println(p.getAge());
    }

}

class Student extends Person{
    private String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

}

class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    
}