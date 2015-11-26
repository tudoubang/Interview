package com.manage.authority;

public class User extends Manager{

    private String value;

    public User(String n,int i,String v){
        super(n,i);
        value = v;
    }

    public String getManager(){
        return "User value: " + value;
    }

    public String getValue(){
        return value;
    }
}