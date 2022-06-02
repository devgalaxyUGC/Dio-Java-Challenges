package GatheringProjects.FourthProject.Arrays.Execute;

import java.util.Random;

/*
    Build a matrix 4x4 with random values between 0 and 9
 */
public class FourthArraySession {
    public static void main(String[] args) {
        Random randomValues = new Random();
        int[][] storageValues = new int[4][4];

        for(int i = 0; i < storageValues.length; i++){
            for(int j = 0; j < storageValues[i].length; j++){
                storageValues[i][j] = randomValues.nextInt(9);
            }
        }
        for (int[] line : storageValues){
            for(int columns : line){
                System.out.print(" "+columns+" ");
            }
        }
        // In this case, "columns" is the method to read each number, so we need a column for numbers
    }
}
