package swiggydemo;

public class Address {

    public String street;
    public String flatNo;
    public String pincode;
    public String city;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", pincode='" + pincode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public Address(String street, String flatNo, String pincode, String city){
        this.street = street;
        this.flatNo = flatNo;
        this.pincode = pincode;
        this.city = city;

    }
}
