package com.hua;

public class Student {
    String num;
    int money;
    int cost;
    int end;
    public Student(String num,int money,int cost,int end){
        this.num=num;
        this.money=money;
        this.cost=cost;
        this.end=end;

    }
    public void print(){

        System.out.println(num+" "+money+" "+cost+" "+end);
    }
}
