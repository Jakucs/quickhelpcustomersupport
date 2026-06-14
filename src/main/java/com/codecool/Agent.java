package com.codecool;

import java.util.List;
import java.util.Random;

public class Agent {
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


    public void addTicket(Ticket ticket){
        this.tickets.add(ticket);
    }

    public void doWorkDay(){
        for(Ticket t : tickets){
            int attemptsForThisTicket = 0;
            boolean result = attempt(t);
            if(result){
                t.resolved=true;
                successfulTickets++;
                continue;
            }
            while (!result && attemptsForThisTicket < maxCallbacksPerTicket && callbacksLeft>0){
                result = attempt(t);
                callbacksLeft--;
                attemptsForThisTicket++;
                if(result){
                    t.resolved=true;
                    successfulTickets++;
                    break;
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
