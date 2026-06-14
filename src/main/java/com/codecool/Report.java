package com.codecool;

public class Report {
    public String name;
    public int successfulTickets;
    public int allTickets;
    public int callbacksLeft;

    public Report(String name, int successfulTickets, int allTickets, int ticketsLeft){
            this.name = name;
            this.successfulTickets = successfulTickets;
            this.allTickets = allTickets;
            this.callbacksLeft = callbacksLeft;
    }



    public int calculateSuccessRate(){
        int successRate = (successfulTickets*100)/allTickets;
        return successRate;
    }

    public boolean attempt(){
        throw new UnsupportedOperationException();
    }

    public Report getReport(){
        throw new UnsupportedOperationException();
    }
}
