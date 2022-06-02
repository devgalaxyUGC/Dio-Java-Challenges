package GatheringProjects.OOParadigm.SecondProjectOO.OOElementsPartTwo.Domain;

public class Funcionario {
    private String Name;
    private String Department;
    private String Duty;
    private double salary;

    public void workingOn(){
        System.out.println("I'm working at Google!");
    }

    public double getMyPaycheck(){
        return salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDuty() {
        return Duty;
    }

    public void setDuty(String duty) {
        Duty = duty;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
