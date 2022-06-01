package UsingMethods.CollectionsProject.DataStructureJava.Execute;


import UsingMethods.CollectionsProject.DataStructureJava.Domain.CarDomain;

import java.util.*;

public class CarExecute {
    public static void main(String[] args) {

        List<CarDomain> myCars = new ArrayList<>() {{
            add(new CarDomain("Volkswagen"));
            add(new CarDomain("Fiat"));
            add(new CarDomain("Chevrollet"));
        }};

        System.out.println("My list contains a Renault's car?  " + myCars.contains("Renault")); // It works with Equals and hashCode

        System.out.println("What's the HashCode of this car? " + new CarDomain("Fiat").hashCode());
        System.out.println("What's the HashCode of this car? " + new CarDomain("Volkswagen").hashCode());
        System.out.println("What's the HashCode of this car? " + new CarDomain("Chevrollet").hashCode());
        System.out.println("What's the HashCode of this car? " + new CarDomain("").hashCode());
        System.out.println("What's the HashCode of this car? " + new CarDomain("Fiat").hashCode());
        System.out.println(myCars.get(0).hashCode()); // Same index of Volkswagen

        System.out.println("===========================================================");

        Stack<CarDomain> myStackOfCars = new Stack<>() {{
            add(new CarDomain("Peugeout"));
            add(new CarDomain("Fiat"));
            add(new CarDomain("Lada"));
        }};


        Queue<CarDomain> myQueueOfCars = new LinkedList(){{
            add(new CarDomain("Hyundai"));
            add(new CarDomain("Jeep"));
            add(new CarDomain("Toyota"));
        }};
    }
}
