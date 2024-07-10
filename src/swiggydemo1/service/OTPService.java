package swiggydemo1.service;

import swiggydemo1.model.Otp;
import swiggydemo1.model.User;

import java.util.Date;
import java.util.UUID;

public class OTPService {

   public User userInstance;
   public Otp otpInstance;

   public Otp generateOtp(User inputUser){
       userInstance = inputUser;
       Otp otp = new Otp();
       otp.otp = UUID.randomUUID().toString();
       otp.creationDate = new Date();
       long currentMilliSec = otp.creationDate.getTime();
       long endTime = currentMilliSec + 900000;
       otp.expiryDate = new Date(endTime);
       otpInstance = otp;
       return otp;
   }
   public String otpValidation(User inputUser,Otp inputOtp){
       if (inputOtp.otp.equals(otpInstance.otp) && inputUser.mobileNumber.equals(otpInstance.mobileNumber)){
           return "otp is valid";
       }else{
           return "otp is invalid";
       }
   }


}
