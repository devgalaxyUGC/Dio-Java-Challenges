package GatheringProjects.ThirdProject.Domain;

public class WeeksDomain {
    public int monthNumber;
    public String Day;

    public WeeksDomain(int monthNumber, String DayName) {
        this.monthNumber = monthNumber;
        this.Day = DayName;
    }

    public void checkMonth() {
        if (monthNumber == 1) {
            System.out.println("Your month is January!");
        } else if (monthNumber == 2) {
            System.out.println("Your month is February!");
        } else if (monthNumber == 3) {
            System.out.println("Your month is March!");
        } else if (monthNumber == 4) {
            System.out.println("Your month is April!");
        } else if (monthNumber == 5) {
            System.out.println("Your month is May!");
        } else if (monthNumber == 6) {
            System.out.println("Your month is June!");
        } else if (monthNumber == 7) {
            System.out.println("Your month is July!");
        } else if (monthNumber == 8) {
            System.out.println("Your month is August!");
        } else if (monthNumber == 9) {
            System.out.println("Your month is September!");
        } else if (monthNumber == 10) {
            System.out.println("Your month is October!");
        } else if (monthNumber == 11) {
            System.out.println("Your month is November!");
        } else if (monthNumber == 12) {
            System.out.println("Your month is December!");
        } else {
            System.out.println("Invalid Entrance");
        }
    }

    // No caso abaixo, o If não é tão versátil, então podemos utilizar o switch
    public void checkVacation() {
        if(monthNumber == 7 || monthNumber == 12 || monthNumber == 1 ){
            System.out.println("Vacation!");
        }
    }

    /* public String checkVacationSwitch(){
        String dayCheckVariable = ;
        switch(monthNumber){
            case 1:
                dayCheckVariable = "Vacation!";
                break;
            case 7:
                dayCheckVariable = "Vacation!";
                break;
            case 12:
                dayCheckVariable = "Vacation!";
                break;
        }
        return dayCheckVariable;
    }
     */


    public void checkDayNumber(){
        switch (Day){
            case "Sunday":
                System.out.println(1);
                System.out.println("Certo");
                break;
            case "Monday":
                System.out.println(2);
                System.out.println("Certo");
                break;
            case "Tuesday":
                System.out.println(3);
                System.out.println("Certo");
                break;
            case "Wednesday":
                System.out.println(4);
                System.out.println("Errado");
                break;
            case "Thursday":
                System.out.println(5);
                System.out.println("Talvez");
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Valor Indefinido");
        }
    }
}
