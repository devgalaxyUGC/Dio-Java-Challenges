package GatheringProjects.OOParadigm.FirstProjectOO.Domain;

public class CarDomain {
    private String Brand;
    private String Color;
    private double tankCapacity;

    public CarDomain(String Brand, String Color, double tankCapacity){
        this.Brand = Brand;
        this.Color = Color;
        this.tankCapacity = tankCapacity;
    }

    public double addFuel(double fuelToAdd){
        this.tankCapacity += fuelToAdd;
        return tankCapacity;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }
}
