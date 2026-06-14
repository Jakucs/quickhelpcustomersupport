package com.codecool;

public class Tickets {
    public static int currentID = 0;
    public int ID;
    public Customers customer;
    public boolean resolved;

    public Tickets(Customers customer){
        this.customer = customer;
        this.ID = currentID++;
        this.resolved = false;
    }
}
