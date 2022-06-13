package GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain;

public abstract class Funcionario {
    protected String Name;
    protected int age;
    protected double salary;

    public Funcionario(String name, int age, double salary) {
        Name = name;
        this.age = age;
        this.salary = salary;
    }

    public abstract void bonusCalculate();

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
