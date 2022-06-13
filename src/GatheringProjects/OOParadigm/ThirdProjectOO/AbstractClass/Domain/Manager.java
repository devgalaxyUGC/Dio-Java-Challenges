package GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain;

public class Manager extends Funcionario{
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void bonusCalculate() {
        this.salary += salary * 1.2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
