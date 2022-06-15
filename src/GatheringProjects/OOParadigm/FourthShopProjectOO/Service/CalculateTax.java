package GatheringProjects.OOParadigm.FourthShopProjectOO.Service;

import GatheringProjects.OOParadigm.FourthShopProjectOO.Domain.Product;

public class CalculateTax {
    public static void calculateTax(Product product){
        System.out.println("Starting Tax Calculate Process...");
        System.out.println("Product name: "+product.getName());
        System.out.println("Product name: "+product.getValue());
        System.out.println(product.taxApplication());
        double finalTax = product.taxApplication();
        System.out.println();
    }
}
