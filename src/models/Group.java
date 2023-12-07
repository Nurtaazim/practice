package models;

import java.util.ArrayList;

public class Group {
    private long id;
    private String name;
    private ArrayList<Lesson> lessons = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();

    public Group() {
    }

    public Group(long id, String name, ArrayList<Lesson> lessons, ArrayList<Student> students) {
        this.id = id;
        this.name = name;
        this.lessons = lessons;
        this.students = students;
    }

    public Group(String name) {
        this.name = name;
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

    public ArrayList<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(ArrayList<Lesson> lessons) {
        this.lessons = lessons;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lessons=" + lessons +
                ", students=" + students +
                '}';
    }
}
