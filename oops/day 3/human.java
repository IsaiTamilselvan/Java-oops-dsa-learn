package com;

public class human{
    int age;
    String name;
    boolean married;

    static long population;

    public human(int age,String name,boolean married){
        this.age=age;
        this.name=name;
        this.married=married;

        human.population+=1;

        System.out.println("new human data is added");
        System.out.println("current population"+human.population);
    }

    public void getpeopleinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.married);
    }
}

