package bookmyshow;

public enum ErrorCode {
    LOGIN_FAILED_101("INVALID MOBILE NUMBER","LOGIN_FAILED_101"),
    SEATS_NOT_AVAILABLE_102("NOT AVAILABLE","SEATS_NOT_AVAILABLE_102"),
    PAYMENT_FAILED_103("INSUFFICIENT FUNDS","PAYMENT_FAILED_103");
    public String message;
    public String code;

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
    ErrorCode(String message, String code){
        this.message = message;
        this.code = code;
    }
}
