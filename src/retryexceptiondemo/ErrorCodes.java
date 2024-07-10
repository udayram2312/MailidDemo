package retryexceptiondemo;

public enum ErrorCodes {

    EVEN_ERROR_CODE("1000","Even number Exception"),
    ODD_ERROR_CODE("1001","OddNumberEXception");

    private String code;
    private String message;
    ErrorCodes(String code,String message){
        this.code = code;
        this.message = message;
    }

    public String getCode(){
        return code;
    }

}
