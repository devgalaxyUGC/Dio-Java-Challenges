package GatheringProjects.FifthProject.Execute;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

        newReadArchive();
    }

    // This is a way to create a method that can read an archive, but it's no so legible, so we can use a Try With Resources
    // since the main thing here is the reader getting close when the method is done
    public static void oldReadArchive() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt")); // Create a exception to handle
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }

    public static void newReadArchive() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        }catch(IOException e){
        e.printStackTrace();
        }
    }
}
