package swiggydemo;

public class PhonePe implements Payment{

        public static int amount= 1000;

        @Override
        public int paymentService() {
            return 1000;
        }
    }
