package GatheringProjects.OOParadigm.FourthShopProjectOO.Domain;

public class Keyboard extends Product {
    protected static final double KEYBOARD_TAX_PERCENT = 0.20;
    protected boolean isRGB;

    public Keyboard(String name, double value, boolean isRGB) {
        super(name, value);
        this.isRGB = isRGB;
    }

    public boolean isRGB() {
        return isRGB;
    }

    @Override
    public double taxApplication() {
        System.out.println("Starting tax application!");
        return this.value * KEYBOARD_TAX_PERCENT;
    }
}
