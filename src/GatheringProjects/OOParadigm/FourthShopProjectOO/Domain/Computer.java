package GatheringProjects.OOParadigm.FourthShopProjectOO.Domain;

public class Computer extends Product {
    private static final double COMPUTER_TAX_PERCENT = 0.25;
    protected boolean isComponentsInvolved;

    public Computer(String name, double value, boolean isComponentsInvolved) {
        super(name, value);
        this.isComponentsInvolved = isComponentsInvolved;
    }

    public boolean getIsComponentsInvolved() {
        return isComponentsInvolved;
    }


    @Override
    public double taxApplication() {
        System.out.println("Starting tax application!");
        return this.value * COMPUTER_TAX_PERCENT;
    }
}
