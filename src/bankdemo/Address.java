package bankdemo;

public class Address {
     public String area;
     public String streetNo;
     public String houseNo;
     public String pincode;

     @Override
     public String toString() {
          return "Address{" +
                  "area='" + area + '\'' +
                  ", streetNo='" + streetNo + '\'' +
                  ", houseNo='" + houseNo + '\'' +
                  ", pincode='" + pincode + '\'' +
                  '}';
     }
}
