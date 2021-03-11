package fju.com;

public class Homework1 {
    public static void main(String[] args) {
        CustomerList[] customer = {
                new CustomerList("0013",490,0,490),
                new CustomerList("0052",1000,100,900),
                new CustomerList("0081",290,0,290),
                new CustomerList("2122",20000,200,1800),
        };
        for (int i = 0; i < customer.length; i++) {
            customer[i].print();
        }
    }
}
