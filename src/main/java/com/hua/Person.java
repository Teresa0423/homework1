package com.hua;

public class Person {
    public static void main(String[] args) {
        Student[] students = {
                new Student("0013",490,0,490),
                new Student("0052",1000,100,900),
                new Student("0018",290,0,290),
                new Student("2122",2000,200,1000),
        };
        for(int i=0;i<students.length;i++){
            students[i].print();
        }
    }
}
