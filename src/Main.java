public class Main {
    /*
	Classes create objects
	Template for creating an object
	Inside the brackets of a class e.g. declaring variables are called fields which store object state
	Methods - executable code that manipulates state and performs operations
	Constructors - gives a variable or a set of vars a value or just giving a thing a value
	 */

    // The class is "Main" this can be used to create Objects

    public static void main(String[] args) {
        // This is the main method = where execution is created
        Aircraft airplane1 = new Aircraft();
        Aircraft airplane2 = new Aircraft();

        airplane1.passengers = 4;
        airplane1.cruiseSpeed = 140;
        airplane1.fuelBurnRate = 56.5;
        airplane1.fuelCapacity = 9.5;

        System.out.println("AIRPLANE 1 DETAILS -");
        System.out.println("Passengers on this flight: " +  airplane1.passengers);
        System.out.println("Cruise Speed on this flight: " +  airplane1.cruiseSpeed);
        System.out.println("Fuel Burn Rate on this flight: " +  airplane1.fuelBurnRate);
        System.out.println("Fuel Capacity on this flight: " +  airplane1.fuelCapacity);

        airplane2.passengers = 1;
        airplane2.cruiseSpeed = 100;
        airplane2.fuelBurnRate = 57.0;
        airplane2.fuelCapacity = 10;

        System.out.println("AIRPLANE 2 DETAILS -");
        System.out.println("Passengers on this flight: " +  airplane2.passengers);
        System.out.println("Cruise Speed on this flight: " +  airplane2.cruiseSpeed);
        System.out.println("Fuel Burn Rate on this flight: " +  airplane2.fuelBurnRate);
        System.out.println("Fuel Capacity on this flight: " +  airplane2.fuelCapacity);

        airplane1 = airplane2; // This "copies" the properties of airplane 2 onto airplane 1

        System.out.println(airplane1.passengers); // result of passenger is 1 instead of 4

    }

}

class Aircraft {
    int passengers;
    int cruiseSpeed;
    double fuelCapacity;
    double fuelBurnRate;

    // this is a template :)
}


