public class CheckedException extends Exception{

    private String code;

    CheckedException(String code, String message){
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
