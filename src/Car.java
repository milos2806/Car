
public class Car {

    String model;
    int maxSpeed;
    int minSpeed;
    double weight;

    String license;
    int maxFuel;
    int currentFuel;
    int consumption; //consuption per distance unit (km)
    int mileage = 0;
    int numberOfPassengers=5;
    int currentNumberOfPassengers=1;
    
    
    public Car() {
        this.model = "default";
        this.maxFuel = 100;
        this.consumption = 5;
    }

    public Car(String customModel, int customMaxFuel, int customConsumption) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
    }
    
    
    public Car(String customModel, int customMaxFuel, int customConsumption, int currPass , int maxPass) {
        this.model = customModel;
        this.maxFuel = customMaxFuel;
        this.consumption = customConsumption;
        this.currentNumberOfPassengers = currPass;
        this.numberOfPassengers = maxPass;
    }

    public void printAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);
        System.out.println("Potrosnja: " + this.consumption);
        System.out.println("Registracija: " + this.license);
        System.out.println("Trenutno stanje u rezervoaru: " + this.currentFuel);
        System.out.println("Ukupna predjena distanca" + this.mileage);
        System.out.println("Trenutni broj putnika je: " + this.currentNumberOfPassengers + "od maksimalnih " + this.numberOfPassengers);
        
        System.out.println();
    }

    public void changeLicense(String customLicense) {
        this.license = customLicense;
    }

    public void changeWeight(double newWeight) {
        this.weight = newWeight;
    }

    public double maxDistance() {
        double dist = this.maxFuel / this.consumption;
        return dist;

        //return this.maxFuel / this.consumption;
    }

    public void fuelUp() {
    this.currentFuel = this.maxFuel;
    }
    
    public void travel(int distance) {

        //ako ima dovoljno goriva za put onda povecaj (mileage , smanji trenutno gorivo )
        //ako nema dovoljno goriva onda ispisi poruku da nema dovoljno goriva)
        if (this.currentFuel >= distance * this.consumption) {
            this.mileage = this.mileage + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
        } else {
            System.out.println("Nema dovoljno goriva za taj put");
        }

    }
    public void getIn() {
        if (this.currentNumberOfPassengers < this.numberOfPassengers){
            this.currentNumberOfPassengers = this.currentNumberOfPassengers + 1;
            System.out.println("Someone got in");
        } else {
            System.out.println("The car is full , there is no space for another passenger");
        }
    
    }
    public void getOut() {
        
        if (this.currentNumberOfPassengers> 0) {
            this.currentNumberOfPassengers = this.currentNumberOfPassengers - 1; 
            System.out.println("Someone got out. Current number" + this.currentNumberOfPassengers);
        } 
        else {
            System.out.println("There are no more passengers");
        }
    
    }
}
