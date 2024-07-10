package swiggydemo1.model;

import java.util.Date;

public class Otp {

    public String otp;
    public Date creationDate;
    public Date expiryDate;
    public String mobileNumber;

    @Override
    public String toString() {
        return "Otp{" +
                "otp='" + otp + '\'' +
                ", creationDate=" + creationDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
