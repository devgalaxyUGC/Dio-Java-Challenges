package GatheringProjects.FifthProject.Execute;


import java.io.File;
import java.io.IOException;

public class ThrowSpecialCases {
    public static void main(String[] args) throws IOException{
    creatingFile2();


    }


    // When we throw an Exception as signature, basically, we play "hot potatoes" and it doesn't dependend properly
    // of try-catch statements and, in the main method or every part you call it, you need to treat this exception
    public static void creatingFile1() throws IOException {
        File file = new File("arquivo\\teste.txt");
        boolean isCreated = file.createNewFile(); // Origin of IOException if we don't handle it
    }

    // In this case, we handle with try-catch statement as usual, but in catch block, we put a "throw e" statement
    // and it works like a new start for the method and properly, we use the exception with signature together
    public static void creatingFile2() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCreated = file.createNewFile(); // Again, IOException
        }catch(IOException e){
            e.printStackTrace();
            throw e; // Unhandled exception if we don't use exception with signature
        }
    }
}
