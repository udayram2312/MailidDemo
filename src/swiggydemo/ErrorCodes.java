package swiggydemo;

public enum ErrorCodes {
   DISH_NOT_FOUND("10001","dish not found") ;
    private String code;
    private String message;


    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
