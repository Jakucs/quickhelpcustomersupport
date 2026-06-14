package com.codecool;

import java.util.List;
import java.util.Random;

public class Agent {
    List<Ticket> tickets;
    int successfulTickets;
    int allTickets;
    int callbacksLeft;


    Random random = new Random();

    public Agent(List<Ticket> tickets, int allTickets, int callbacksLeft){
        this.tickets = tickets;
        this.successfulTickets = 0;
        this.allTickets = allTickets;
        this.callbacksLeft = callbacksLeft;
    }


    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void doWorkDay(){
        for(Ticket t : tickets){
            if(!t.resolved && callbacksLeft>0){
                boolean successfulCall = attempt(t);
                callbacksLeft--;
                if(successfulCall){
                    t.resolved=true;
                    successfulTickets++;
                }else if(callbacksLeft>0){
                    attempt(t);
                }
            }
        }
    }

    public boolean attempt(Ticket ticket){
        int randomNumber = random.nextInt(0, 10);
        if(randomNumber>6){
            return true;
        }
        return false;
    }
}
