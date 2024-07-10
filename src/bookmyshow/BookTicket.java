package bookmyshow;

public class BookTicket extends Login {
    public int noofSeats;
    public int totalSeats;

    public double ticketPrice;
    public double totalPrice;

    public BookTicket(String mobileNo, String otp, int noofSeats,double ticketPrice) {
        super(mobileNo, otp);
        this.noofSeats = noofSeats;
        this.totalSeats = 20;
        this.ticketPrice = ticketPrice;
    }
    public String ticket()  {
        if (totalSeats >= noofSeats) {
            System.out.println(ticketPrice);
            totalPrice = ticketPrice*noofSeats;
            System.out.println("total price");
            System.out.println("ticket booking successfull");
        } else {
            System.out.println("ticket booking unsueecessfull");
            //throw new BookMyShow.CustomCheckedException(ErrorCode.SEATS_NOT_AVAILABLE_102.getCode(), ErrorCode.SEATS_NOT_AVAILABLE_102.getMessage());
        }
        return "ticket booking";
    }
}
