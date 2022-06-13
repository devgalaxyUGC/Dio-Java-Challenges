package GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain;

public class Developer extends Funcionario{
    protected String LanguageUsed;

    public Developer(String name, int age, double salary, String languageUsed) {
        super(name, age, salary);
        LanguageUsed = languageUsed;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "LanguageUsed='" + LanguageUsed + '\'' +
                ", Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void bonusCalculate() {

    }
}
