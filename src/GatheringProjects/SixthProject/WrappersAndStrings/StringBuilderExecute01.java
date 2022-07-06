package GatheringProjects.SixthProject.WrappersAndStrings;

public class StringBuilderExecute01 {
    public static void main(String[] args) {
        // As we developed in StringExecute01 Class, we can construct a StringBuilder that'll work faster than a String
        // loop, for example, optimizing the performance related to our code and the System.

        long initalTime = System.currentTimeMillis();
        concatWithoutSB(10_000);
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to concatString method work properly with num of loops: "+(finalTime - initalTime)+"ms");

        initalTime = System.currentTimeMillis();
        concatUsingSB(10_000);
        finalTime = System.currentTimeMillis();
        System.out.println("Time to concatString method work properly with num of loops: "+(finalTime - initalTime)+"ms");
    }

    // Using a normal loop of String
    public static void concatWithoutSB(int numOfLoops){
        String text = " ";
        for (int i = 0; i < numOfLoops ; i++) {
            text += i;
        }
    }

    // Faster than the first method and also use particular methods from String Builder Class like reverse/append/etc
    public static void concatUsingSB(int numOfLoops){
        StringBuilder sb = new StringBuilder(numOfLoops);
        for (int i = 0; i < numOfLoops; i++) {
            sb.append(i);
        }
    }
}
