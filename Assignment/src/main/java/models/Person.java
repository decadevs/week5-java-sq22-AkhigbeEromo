package models;

import enums.Gender;
import enums.Role;

public class Person {
    private String name;
    private int age;
    private Gender gender;
    private Role role;

    public Person(String name, int age, Gender gender, Role role) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }


    public Gender getGender() {
        return gender;
    }


    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", role=" + role +
                '}';
    }
}
