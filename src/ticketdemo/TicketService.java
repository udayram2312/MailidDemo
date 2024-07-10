package ticketdemo;

import java.util.Date;

public class TicketService {

   public Ticket bookTicket(String rowNumber,int[] seatNumber,int totalSeats,int money){

       Ticket bookTicket= new Ticket();
       bookTicket.movieName = "saalar";
       bookTicket.date = new Date();


       Row row = new Row();
       row.rowNumber = "d";
      // row.seatNumber =





       return  bookTicket;


   }
}
