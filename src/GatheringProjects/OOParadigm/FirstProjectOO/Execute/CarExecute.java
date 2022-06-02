package GatheringProjects.OOParadigm.FirstProjectOO.Execute;

import GatheringProjects.OOParadigm.FirstProjectOO.Domain.CarDomain;

public class CarExecute {
    public static void main(String[] args) {
        CarDomain car1 = new CarDomain("Ford", "Red", 18.5f);

        System.out.println("Car1 following attributes:");
        System.out.println("Car Brand: "+car1.getBrand()+"\nCar Color: "+ car1.getColor()+"\nCar Capacity: "+car1.getTankCapacity());

        car1.addFuel(15.0);
    }
}
