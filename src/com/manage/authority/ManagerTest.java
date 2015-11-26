package com.manage.authority;

public class ManagerTest{

    public static void main(String [] args){
        Manager[] manager = new Manager[2];

        manager[0] = new User("John", 113, "#00#h");
        manager[1] = new Role("HUB", 114, "admin/users", 3);

        for(Manager n : manager){
            System.out.println("Name: " + n.getName() + " ,Id: " + n.getId() + "  " + n.getManager());
        }
    }
}