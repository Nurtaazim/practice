package service.impl;

import additionally.GeneradeId;
import models.Group;
import service.GroupService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GroupServiceImpl implements GroupService {
    @Override
    public Group addGroup(Group group, ArrayList<Group> groups) {
        group.setId(GeneradeId.generateId());
        group.setName(group.getName());
        groups.add(group);
        System.out.println("Группа ийгиликтуу тузулду!");
        return group;
    }

    @Override
    public Group getGroupByName(String name, ArrayList<Group> groups) {
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(name)) return group;
        }
        System.err.println("Мындай группа жок !");
        return null;
    }

    @Override
    public ArrayList<Group> getAllGroups(ArrayList<Group> groups) {
        return groups;
    }

    @Override
    public void updateGroup(String name, String newName, ArrayList<Group> groups) {
        for (Group group : groups) {
            if (group.getName().equalsIgnoreCase(name)){
                group.setName(newName);
                System.out.println("Группанын аты ийгиликтуу озгорулду !");
                return;
            }
        }
        System.err.println("Мындай аккаунт жок !");
    }

    @Override
    public Set<Group> deleteGroup(String name, ArrayList<Group> groups) {
        Set<Group> massiv = new HashSet<>(groups);
        massiv.removeIf(group -> group.getName().equalsIgnoreCase(name));
        System.out.println("Группа ийгиликтуу очурулду ! ");
        return massiv;
    }
}
