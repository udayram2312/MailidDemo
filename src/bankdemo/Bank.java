package bankdemo;

public class Bank {
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String mobileNo;
    public String panNo;
    public Address address;

    @Override
    public String toString() {
        return "Bank{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", panNo='" + panNo + '\'' +
                ", address=" + address +
                '}';
    }
}
