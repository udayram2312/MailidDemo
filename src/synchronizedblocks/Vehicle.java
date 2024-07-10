package synchronizedblocks;
    public class Vehicle extends Thread{
        int litres;
        String status;
        String type;

        PetrolStation petrolStation;

        public Vehicle(int litres, String status, String type, PetrolStation petrolStation) {
            this.litres = litres;
            this.status = status;
            this.type = type;
            this.petrolStation = petrolStation;
        }
        public void run(){
            if(type.equals("petrol")){
                System.out.println("vehicle number "+Thread.currentThread().getName());
                petrolStation.petrolSynchronizedBlock(Thread.currentThread().getName(),this.litres);
            }else{
                petrolStation.dieselsynchronizedBlock(Thread.currentThread().getName(), this.litres);
            }
        }
    }

