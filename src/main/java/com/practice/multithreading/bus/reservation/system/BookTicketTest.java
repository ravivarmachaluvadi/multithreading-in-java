package com.practice.multithreading.bus.reservation.system;

public class BookTicketTest {

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"John",2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"Martin",2);
        TicketBookingThread t3 = new TicketBookingThread(ticketCounter,"Ravi",1);
        
        t2.start();
        t1.start();
        t3.start();
    }
}

/*
Hi,Martin : 2 Seats booked Successfully..
Hi,Ravi : 1 Seats booked Successfully..
Hi,John : Seats Not Available
 */