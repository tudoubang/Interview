package com.manage.authority;


public abstract class Manager {

	private int id;
	private String name;
    public abstract String getManager();

    public Manager(String n,int i){
    	name = n;
        id = i;
    }

    public String getName(){
    	return name;
    }

    public int getId(){
        return id;
    }
}
