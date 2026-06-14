# QuickHelp Customer Support

A Java application that simulates the daily work of a customer support call center.

## Description

QuickHelp handles incoming technical support tickets for various companies on an outsourcing basis. Agents are assigned a batch of tickets each morning, and throughout the day they try to resolve them over the phone.

At the end of the simulation, we'd like to see who the most successful agent was. Success is measured by the rate of resolved tickets versus failed ones (e.g., 2 out of 10 is 20%, 4 out of 6 is 67%).

Calls sometimes fail — most commonly because the customer doesn't answer the phone, or the issue isn't resolved on the first try. In such cases, the agent calls the customer back later. There's a limit on the number of callbacks, since the agent has other tickets to handle and must finish their shift at some point. Agents are responsible for their own callback strategy: how many times they retry a given ticket, and how many callbacks in total they're willing to make per day.

### Example agents

| Agent | Max callbacks per ticket | Max callbacks per day |
| ----- | ------------------------ | ---------------------- |
| Anna  | 3                         | 5                       |
| Ben   | 2                         | 6                       |
| Cara  | 4                         | 10                      |

Simulate a working day for these 3 agents.

### Example output

```
Agent Anna resolved 7 tickets out of 10: success rate 70% (0 callback(s) left)
Agent Ben resolved 5 tickets out of 10: success rate 50% (0 callback(s) left)
Agent Cara resolved 10 tickets out of 10: success rate 100% (1 callback(s) left)
The winner is Agent Cara
```

## Learning objectives

- Implement classes with state and behavior
- Create instances of classes and use them
- Work with random numbers in Java

## Tasks

### 1. Handling customers

Your program should be able to create and store customer data, which will be needed for the tickets. A customer contains the following information: the customer's name, email address, and a 4-digit customer ID code.

**Criteria**

- [ ] The `Customer` class is implemented with 3 fields and a constructor

### 2. Handling tickets

A ticket represents a support case that agents try to resolve. A ticket has a unique id and an associated customer. It also stores information on whether or not it has been resolved.

**Criteria**

- [ ] The `Ticket` class is implemented with 3 fields and a constructor

### 3. Handling reports

At the end of the day, each agent files a report. It contains the agent's name, all the info needed to calculate their success rate, and how many callbacks they have left.

**Criteria**

- [ ] The `Report` class is implemented with the necessary fields and constructor
- [ ] The `Report` class has a method that returns a string with the report data (see example output above)

### 4. Handling agents

Now that the data classes are ready, we come to the class where most of the application logic happens. An agent should be able to take on tickets, spend the day trying to resolve them, and create a report at the end of the day.

**Criteria**

- [ ] The `addTicket()` method is implemented, necessary fields are declared
- [ ] The `doWorkDay()` method is implemented to attempt to resolve every ticket, and to do callbacks when needed; necessary fields are declared
- [ ] Successfully resolved tickets are not handled again
- [ ] Callbacks are done according to the agent's own strategy (see examples above)
- [ ] The `createReport()` method creates a report from the agent's daily statistics
- [ ] The `Agent` class has a constructor where the initial values of the fields are set

### 5. Run the simulation

Create three `Agent` objects with different callback strategies. Create tickets for them to work with, then make them do their routine. When they're finished, ask them for their reports. When you have the data, compare their performances and select the best agent.

**Criteria**

- [ ] All customer data are randomly generated
- [ ] Once the program has run, an announcement about the best agent is visible on the console

### 6. Fast forward (optional)

No company should exist for just one day of work. Simulate weeks, months, or even years, and see if there is a callback strategy that performs particularly well or particularly badly.

**Criteria**

- [ ] The number of days simulated in the program can be controlled through a parameter
- [ ] Agents start new days fresh: they don't attempt to resolve tickets from the previous day, whether or not those were successfully resolved

## Hints

Since this is an entry-level assignment in class design, it's worth planning out your classes and main method signatures before you start coding.

Create a class named `RandomDataGenerator` — a great place for your random data generation logic (names, emails, ID codes). Once you're ready with your implementation, create an instance and call its methods to get your random data.
