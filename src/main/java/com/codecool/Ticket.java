package com.codecool;

public class Ticket {
    public static int currentID = 0;
    public int ID;
    public Customer customer;
    public boolean resolved;

    public Ticket(Customer customer){
        this.customer = customer;
        this.ID = currentID++;
        this.resolved = false;
    }
}