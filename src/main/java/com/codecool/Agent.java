package com.codecool;

import java.util.List;
import java.util.Random;

public class Agent {
    String name;
    List<Ticket> tickets;
    int successfulTickets;
    int allTickets;
    int callbacksLeft;
    int maxCallbacksPerTicket;


    Random random = new Random();

    public Agent(List<Ticket> tickets, int allTickets, int callbacksLeft, int maxCallbacksPerTicket){
        this.tickets = tickets;
        this.successfulTickets = 0;
        this.allTickets = allTickets;
        this.callbacksLeft = callbacksLeft;
        this.maxCallbacksPerTicket = maxCallbacksPerTicket;
    }

    public Report createReport(){
        Report report = new Report(name, successfulTickets, allTickets, callbacksLeft);
        return report;
    }


    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }
    public void doWorkDay(){
        for(Ticket t : tickets){
            int reattemptsPerTicket = 0;
            boolean result = attempt(t);
            if(result){
                successfulTickets++;
                callbacksLeft--;
                t.resolved=true;
                continue;
            }
            while (!result && callbacksLeft>0 && reattemptsPerTicket<maxCallbacksPerTicket){
                reattemptsPerTicket++;
                    callbacksLeft--;
                result = attempt(t);
                if(result){
                    successfulTickets++;
                    t.resolved=true;
                    break;
                }
            }
        }
        //maybe can we call the createReport method over the day?
    }
    public boolean attempt(Ticket ticket){
        int randomNumber = random.nextInt(0, 10);
        if(randomNumber>6){
            return true;
        }
        return false;
    }
}
