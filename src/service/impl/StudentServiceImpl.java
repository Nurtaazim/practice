package service.impl;

import additionally.GeneradeId;
import models.Group;
import models.Student;
import service.StudentService;

import java.util.ArrayList;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student student, String console, ArrayList<Group> groups) {
        student.setId(GeneradeId.generateId());
        student.setName(student.getName());
        student.setSurname(student.getSurname());
        student.setAge(student.getAge());
        student.setGender(student.getGender());
        student.setGmail(student.getGmail());
        student.setPassword(student.getPassword());
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(console)) group.getStudents().add(student);
            System.out.println("Студент ийгиликтуу кошулду!");
            return;
        }
        System.err.println("Мындай группа жок!");

    }

    @Override
    public ArrayList<Student> getStudentsByGroup(String name, ArrayList<Group> groups) {
        ArrayList<Student> students = new ArrayList<>();
        for (Group group : groups) {
            if (name.equalsIgnoreCase(group.getName())){
                students.addAll(group.getStudents());
            }
        }
        return students;
    }

    @Override
    public void getStudentByName(String name, ArrayList<Group> groups) {

    }

    @Override
    public void deleteStudentById(long id, ArrayList<Group> groups) {

    }
}
