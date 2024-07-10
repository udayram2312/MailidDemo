package synchronizedblocks;

public class PetrolStation {

    Object petrol = new Object();
    Object diesel = new Object();

    public  void petrolSynchronizedBlock(String vehicleNumber,int numberOfLitres){
        synchronized (petrol) {
            for (int i = 0; i <= numberOfLitres; i++) {
                System.out.println("vehicle Number ==" + vehicleNumber + "filled petrol in litres == " + i);
            }
        }
    }
    public  void dieselsynchronizedBlock(String vehicleNumber,int numberOfLitres){
        synchronized (diesel) {
            for (int i = 0; i <= numberOfLitres; i++) {
                System.out.println("vehicle Number ==" + vehicleNumber + "filled diesel in litres == " + i);
            }
        }
    }
}


