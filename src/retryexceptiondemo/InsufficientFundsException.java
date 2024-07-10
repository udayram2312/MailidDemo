package retryexceptiondemo;

public class InsufficientFundsException extends RuntimeException{

    private String errorCode;
    private String errorMessage;

    public InsufficientFundsException(String code,String message){
        super(message);
        this.errorCode = code;
        this.errorMessage = message;
    }
}
