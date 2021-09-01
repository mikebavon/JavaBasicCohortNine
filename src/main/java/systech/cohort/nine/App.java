package systech.cohort.nine;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ){
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        Vehicle toyota = new Toyota();
        vehicles.add(toyota);

        Vehicle subaru = new Subaru();
        vehicles.add(subaru);

        Vehicle mazda = new Mazda();
        vehicles.add(mazda);

        Vehicle bmw = new Bmw();
        vehicles.add(bmw);

        Vehicle[] vehiclesArr = {toyota, subaru, mazda, bmw};

        System.out.println(vehicles.get(1).getCountry());

        System.out.println(vehiclesArr[3].getCountry());
        System.out.println(vehiclesArr[2].getCountry());
        System.out.println(vehiclesArr[0].getCountry());

        System.out.println();
        System.out.println();
        System.out.println();

        MotorCycle ducati = new Ducati();
        System.out.println(ducati.getCountry());




    }

}
