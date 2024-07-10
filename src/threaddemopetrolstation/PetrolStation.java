package threaddemopetrolstation;

public class PetrolStation {

    public synchronized void petrol(String vehicleNumber,int numberOfLitres){

        for(int i = 0;i<=numberOfLitres;i++){
            System.out.println("vehicle Number =="+vehicleNumber+"filled petrol in litres == "+i);
        }

    }
    public synchronized void diesel(String vehicleNumber,int numberOfLitres){
        for(int i = 0;i<=numberOfLitres;i++){
            System.out.println("vehicle Number =="+vehicleNumber+"filled diesel in litres == "+i);
        }

    }
}
