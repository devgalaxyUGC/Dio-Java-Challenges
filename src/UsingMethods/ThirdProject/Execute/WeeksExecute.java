package UsingMethods.ThirdProject.Execute;

import UsingMethods.ThirdProject.Domain.WeeksDomain;

public class WeeksExecute {
    public static void main(String[] args) {
        WeeksDomain subject1 = new WeeksDomain(5, "Monday");

        subject1.checkMonth();
        subject1.checkVacation();
        subject1.checkDayNumber();
        //System.out.println(subject1.checkVacationSwitch());
    }
}
