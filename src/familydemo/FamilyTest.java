package familydemo;

public class FamilyTest {

    public static void main(String[] args) {
        Family a = new Family();
        Address aAddress = new Address();
        aAddress.street = "2";
        aAddress.city = "hyd";
        aAddress.area = "hyd";
        aAddress.flatNo = "2-56";
        aAddress.pinCode = "500014";
        aAddress.state = "TG";

        a.name = "A";
        a.address = aAddress;
        Family[] akids = new Family[2];
        Family b = new Family();
        Address bAddress = new Address();
        bAddress.street = "2";
        bAddress.city = "hyd";
        bAddress.area = "hyd";
        bAddress.flatNo = "2-56";
        bAddress.pinCode = "500014";
        bAddress.state = "TG";
        a.name = "B";
        a = new Family();


    }
}
