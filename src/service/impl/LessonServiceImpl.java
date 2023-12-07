package service.impl;

import additionally.GeneradeId;
import models.Group;
import models.Lesson;
import service.LessonService;

import java.util.ArrayList;

public class LessonServiceImpl implements LessonService {
    @Override
    public void addLesson(Lesson lesson, String groupName, ArrayList<Group> groups) {
        lesson.setId(GeneradeId.generateId());
        lesson.setName(lesson.getName());
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(groupName)) {
                group.getLessons().add(lesson);
                System.out.println("Сабак ийгиликтуу кошулду!");
                return;
            }
        }
        System.err.println("Мындай группа табылган жок!");
    }

    @Override
    public void deleteLesson(String name,String lessonName, ArrayList<Group> groups) {
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(name)){
                for (Lesson lesson : group.getLessons()) {
                    if (lessonName.equalsIgnoreCase(lesson.getName())){
                        group.getLessons().remove(lesson);
                        System.out.println("Сабак ийгиликтуу очурулду!");
                        return;
                    }
                }
                System.err.println("Мындай сабак табылган жок!");

            }
            System.err.println("Мындай группа табылган жок!");
        }

    }

    @Override
    public ArrayList<Lesson> getLessonsByGroup(String groupName,ArrayList<Group> groups) {
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(groupName)){
                return group.getLessons();
            }
        }
        System.err.println("Мындай группа жок!");
        return null;
    }

    @Override
    public void getAllLessons(ArrayList<Group> groups) {
        for (Group group : groups) {
            System.out.println(group.getLessons());
        }
    }
}
