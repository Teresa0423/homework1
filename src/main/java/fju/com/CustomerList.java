package fju.com;

public class CustomerList {
    String customerid;
    int cost;
    int discount;
    int amount;
    public  CustomerList(String customerid, int cost, int discount, int amount){
        this.customerid = customerid;
        this.cost = cost;
        this.discount = discount;
        this.amount = amount;
    }
    public void print(){
        System.out.println(customerid + "\t"+ cost + "\t"+ discount + "\t" + amount+ "\t");
    }
}
