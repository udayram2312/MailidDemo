package swiggydemo1.service;

import swiggydemo1.model.Otp;
import swiggydemo1.model.Restaurant;
import swiggydemo1.model.User;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class SwiggyService {
    public Otp generateOtp;

    public Otp registerRestaurant(Restaurant restaurant) {
        OTPService otpService = new OTPService();
        return otpService.generateOtp(restaurant.user);

    }

    public String validateOtp(Otp inputOtp, User user) {
        OTPService otpService = new OTPService();
        return otpService.otpValidation(user, inputOtp);
    }
}
