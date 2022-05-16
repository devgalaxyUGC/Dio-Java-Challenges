package UsingMethods.FirstProject.Execute;

import UsingMethods.FirstProject.Domain.ArithmeticDomain;
import UsingMethods.FirstProject.Domain.DailyMessageDomain;
import UsingMethods.FirstProject.Domain.OverdraftDomain;

public class FirstProject {
    public static void main(String[] args) {
        ArithmeticDomain firstObject = new ArithmeticDomain();
        DailyMessageDomain secondObject = new DailyMessageDomain(24);
        OverdraftDomain thirdObject = new OverdraftDomain(500.0);
        OverdraftDomain fourthObject = new OverdraftDomain(2000.0);
        System.out.println("Calculate Package Below:");

        firstObject.sumNumbers(12, 10);
        firstObject.subNumbers(12, 10);
        firstObject.multNumbers(12, 10);
        firstObject.divNumbers(12, 10);
        firstObject.restdiv(12, 10);

        System.out.println("=================================================");
        System.out.println("Daily Message Package Below:");

        secondObject.dailyMessage();

        System.out.println("=================================================");
        System.out.println("Overdraft Package Below:");

        thirdObject.printAccount();
        thirdObject.overdraftExecution(200);
        thirdObject.printAccount();
        System.out.println("=================================================");
        thirdObject.overdraftExecution(100);
        thirdObject.printAccount();

    }
}
