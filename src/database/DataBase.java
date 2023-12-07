package database;

import models.Group;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<Group> groups = new ArrayList<>();

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public DataBase(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public DataBase() {
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "groups=" + groups +
                '}';
    }
}
