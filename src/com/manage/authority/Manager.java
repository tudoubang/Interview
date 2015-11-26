package com.manage.authority;


public abstract class Manager {

	private int Id;
	private String name;
    public abstract String getManager();

    public Manager(String n){
    	name = n;
    }

    public String getName(){
    	return name;
    }

    public int getId(){
        return (int) (Math.random() * 10);
    }
}
