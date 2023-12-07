package models;

import enums.Gender;

import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private String surname;
    private int age;
    private Gender gender;
    private String gmail;
    private String password;
    private ArrayList<Lesson> lessons;

    public Student() {
    }

    public Student(long id, String name, String surname, int age, Gender gender, String gmail, String password, ArrayList<Lesson> lessons) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.gmail = gmail;
        this.password = password;
        this.lessons = lessons;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", gmail='" + gmail + '\'' +
                ", password='" + password + '\'' +
                ", lessons=" + lessons +
                '}';
    }
}
