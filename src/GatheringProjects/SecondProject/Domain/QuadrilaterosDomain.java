package GatheringProjects.SecondProject.Domain;

public class QuadrilaterosDomain {
    public double printArea(double lado){
        return lado * lado;
    }

    public double printArea(double comprimento, double altura){
        return comprimento * altura;
    }

    public double printArea(double baseMaior, double baseMenor, double altura){
        return (baseMaior+baseMenor)*altura/2;
    }

    public float printArea(float diagonal1,float diagonal2){
        return diagonal1*diagonal2/2;
    }
}
