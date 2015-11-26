package com.manage.authority;

public class Role extends Manager{

    private String list;
    private int sort;

    public Role(String n, int i, String l, int s){
        super(n,i);
        list = l;
        sort = s;
    }

    public String getList(){
        return list;
    }

    public int getSort(){
        return sort;
    }

    public String getManager(){
        return "Role have list: " + list + " ,Sort is: " + sort;
    }

}