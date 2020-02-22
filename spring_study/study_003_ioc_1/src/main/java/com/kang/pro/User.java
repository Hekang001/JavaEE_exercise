package com.kang.pro;

public class User {
    private String name;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    /*
       public User(){
            System.out.println("User的无参构造");
        }
    */
    public User(String name){
        this.name=name;
        System.out.println("User的有参构造");
    }
    public User(String name,int score){
        this.name=name;
        this.score=score;
        System.out.println("User的有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public void show(){
        System.out.println("name:"+name);
    }
}
