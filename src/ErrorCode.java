public enum ErrorCode{


    LOGIN_FAILED ("LOGIN_FAILED_101","INVALID USERNAME");

    private String code;
    private String message;

    public String getCode(){
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCode(String code, String message){
         this.message = message;
         this.code = code;



    }
}
