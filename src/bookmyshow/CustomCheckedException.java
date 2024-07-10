package bookmyshow;

public class CustomCheckedException extends Exception {
    String code;
    public CustomCheckedException(String code ,String message){
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
