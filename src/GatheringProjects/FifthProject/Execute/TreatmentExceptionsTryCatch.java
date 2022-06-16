package GatheringProjects.FifthProject.Execute;


import java.io.File;
import java.io.IOException;

public class TreatmentExceptionsTryCatch {
    public static void main(String[] args) {
    creatingFile();

    }

    public static void creatingFile(){
        File file = new File("arquivo\\teste.txt");
        // Notice we have an Exception error if we don't treat correctly below
        // file.createNewFile();
        // So, we need to construct a try-catch method to handle checked exceptions
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Was the file created? "+isCreated);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
