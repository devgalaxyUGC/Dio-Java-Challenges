package GatheringProjects.OOParadigm.FourthShopProjectOO.Domain;

public abstract class Product implements TaxInterface {
    protected String Name;
    protected double value;

    public Product(String name, double value) {
        Name = name;
        this.value = value;
    }

    public String getName() {
        return Name;
    }

    public double getValue() {
        return value;
    }
}
