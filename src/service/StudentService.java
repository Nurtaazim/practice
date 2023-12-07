package service;

import models.Group;
import models.Student;

import java.util.ArrayList;

public interface StudentService {
    void addStudent (Student student,String console, ArrayList<Group> groups);
    ArrayList<Student> getStudentsByGroup(String name , ArrayList<Group> groups);
    void getStudentByName(String name, ArrayList<Group> groups);
    void deleteStudentById(long id, ArrayList<Group> groups);
}
