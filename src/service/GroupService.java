package service;

import models.Group;

import java.util.ArrayList;
import java.util.Set;

public interface GroupService {
    Group addGroup(Group group , ArrayList<Group> groups);
    Group getGroupByName(String name, ArrayList<Group> groups);
    ArrayList<Group> getAllGroups(ArrayList<Group> groups);
    void updateGroup (String name,String newName, ArrayList<Group> groups);
    Set<Group> deleteGroup (String name, ArrayList<Group> groups);
}
