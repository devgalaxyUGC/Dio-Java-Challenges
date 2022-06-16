package GatheringProjects.FifthProject.Execute;

public class ErrorsIterator {
    public static void main(String[] args) {
        // recursividadeError();
        // Above, if we run this code with recursividadeError(); inside main with the declaration below
        // we'll get an error about the StackOverFlowError, what it means the memory space is out of space
    }

    public static void recursividadeError(){
        recursividadeError();
    }
}

