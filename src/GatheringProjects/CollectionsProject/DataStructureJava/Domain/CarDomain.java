package GatheringProjects.CollectionsProject.DataStructureJava.Domain;

import java.util.Objects;

public class CarDomain {
    private String Brand;

    public CarDomain(String CarBrand) {
        this.Brand = CarBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDomain carDomain = (CarDomain) o;
        return Objects.equals(Brand, carDomain.Brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Brand);
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }
}
