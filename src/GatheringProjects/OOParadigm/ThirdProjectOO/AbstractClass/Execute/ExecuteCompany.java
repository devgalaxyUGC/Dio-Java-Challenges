package GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Execute;

import GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain.Developer;
import GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain.Funcionario;
import GatheringProjects.OOParadigm.ThirdProjectOO.AbstractClass.Domain.Manager;

public class ExecuteCompany {
    public static void main(String[] args) {
        // So, in this case, we can use one of the main ideas using OO paradigm. We can create classes with
        // extended functions by a ABSTRACT class/Base Class, overriding attributes with your particularities
        Manager manager = new Manager("Rachel", 30, 5000);
        System.out.println(manager);
        Developer developer = new Developer("Yghor", 22, 8000, "C++");
        System.out.println(developer);
    }
}
