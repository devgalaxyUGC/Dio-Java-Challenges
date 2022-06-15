package GatheringProjects.OOParadigm.FourthShopProjectOO.Execute;


import GatheringProjects.OOParadigm.FourthShopProjectOO.Domain.Computer;
import GatheringProjects.OOParadigm.FourthShopProjectOO.Domain.Keyboard;
import GatheringProjects.OOParadigm.FourthShopProjectOO.Domain.Product;
import GatheringProjects.OOParadigm.FourthShopProjectOO.Service.CalculateTax;

public class Execute01 {
    public static void main(String[] args) {
        Product computer01 = new Computer("PC Gamer FireStarter", 10000, true);
        Product keyboard01 = new Keyboard("Corsair RGB 2019", 250, true);

        System.out.println("Initial value: "+computer01.getValue());
        CalculateTax.calculateTax(computer01);
        System.out.println("=====================================");
        System.out.println("Initial value: "+keyboard01.getValue());
        CalculateTax.calculateTax(keyboard01);

    }
}
