package service;

import models.Group;
import models.Lesson;

import java.util.ArrayList;

public interface LessonService {
    void addLesson (Lesson lesson, String groupName, ArrayList<Group> groups);
    void deleteLesson(String name ,String lessonName, ArrayList<Group> groups);
    ArrayList<Lesson> getLessonsByGroup(String groupName,ArrayList<Group> groups);
    void getAllLessons (ArrayList<Group> groups);
}
