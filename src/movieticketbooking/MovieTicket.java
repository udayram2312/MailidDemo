package movieticketbooking;

public abstract class MovieTicket {
    private String movieName;
    private int rowNo;
    private int seatNo;
    public MovieTicket(String movieName,int rowNo,int seatNo){

        this.movieName = movieName;
        this.rowNo = rowNo;
        this.seatNo = seatNo;


    }
public abstract double calculateAmount();

}






