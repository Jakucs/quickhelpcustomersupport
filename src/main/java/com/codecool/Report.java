package com.codecool;

public class Report {
    public String name;
    public int successfulTickets;
    public int allTickets;
    public int ticketsLeft;

    public Report(int successfulTickets, int allTickets, int ticketsLeft){
            this.successfulTickets = successfulTickets;
            this.allTickets = allTickets;
            this.ticketsLeft = ticketsLeft;
    }



    public int calculateSuccessRate(){
        throw new UnsupportedOperationException();
    }

    public boolean attempt(){
        throw new UnsupportedOperationException();
    }

    public Report getReport(){
        throw new UnsupportedOperationException();
    }
}
