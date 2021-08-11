package com.capgemini.training;
import java.util.Scanner;
/*
 * @author RUPESH KUMAR
 */
	 public class TicketMachine {
	     int noOfTicketAvail;
	     int noOfTicketRequested;
	     int ticketPrice;
	     int money;
	     /**
	      * 
	      * @param ticketPrice
	      * @param noOfTicketAvail
	      *
	      */
	     public TicketMachine(int ticketPrice, int noOfTicketAvail){
	         if(ticketPrice < 0) {
	             System.out.println("Overriding Entered ticket price to default price");
	             this.ticketPrice = 10;
	         }else{
	             this.ticketPrice = ticketPrice;
	         }
	         if(noOfTicketAvail<0) {
	             System.out.println("Overriding Entered ticket availability to default ticket availability");
	             this.noOfTicketAvail = 5;
	         }else{
	             this.noOfTicketAvail = noOfTicketAvail;
	         }
	     }
	     /*
	      * @param amount
	      * @param ticketRequested
	      */
	     public String addMoneyAndNoOfTicketsReq(int amount, int ticketReq) {
	         if(amount < 1 && ticketReq < 1) {
	             return "Value is too less to add";
	         }
	         else {
	             this.money = this.money + amount;
	             this.noOfTicketRequested = this.noOfTicketRequested + ticketReq;
	             return "Value is added successully";
	         }
	     }
	     /*
	      * @param noOfTicketAvail
	      * @param noOfTicketRequested
	      * @return
	      */
	     public boolean checkTicketsAvailability(int noOfTicketAvail, int noOfTicketRequested) {
	         if(noOfTicketAvail < noOfTicketRequested) {
	             return false;
	         }
	         else {
	             this.noOfTicketAvail=noOfTicketAvail-noOfTicketRequested;
	             return true;
	         }
	     }
	     public void printTicket() {
	         if(money <ticketPrice) {
	             System.out.println("remaining amount is to be paid");
	         }
	         else {
	             System.out.println("the ticket is printed and the extra amount is refunded to the user");
	         }
	     }
	 }

