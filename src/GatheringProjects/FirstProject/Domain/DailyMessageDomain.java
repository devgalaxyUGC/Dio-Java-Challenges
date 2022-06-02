package GatheringProjects.FirstProject.Domain;

public class DailyMessageDomain {
    double hourVariable;

    public DailyMessageDomain(double hourVariable){
        this.hourVariable = hourVariable;
    }

    public void dailyMessage(){
        if(hourVariable >= 0.0 && hourVariable < 12.00){
            System.out.println("Good Morning!");
        }
        else if(hourVariable >= 12.00 && hourVariable < 18.00){
            System.out.println("Good Afternoon!");
        }
        else if(hourVariable >= 18.00 && hourVariable < 24.00){
            System.out.println("Good Night!");
        }
        else if(hourVariable == 24.0){
            System.out.println("Good Morning!");
        }
        else{
            System.out.println("Invalid Entrance!");
        }
    }
}
