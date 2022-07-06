package GatheringProjects.SixthProject.WrappersAndStrings;

public class StringsExecute01 {
    public static void main(String[] args) {
        String name1 = "Bryan"; // String in String Pool
        String name2 = "Bryan"; // Same String value for name1 and name2
        System.out.println(name1 == name2);

        name1 = name1.concat("Santos"); // Another String value created in String Pool
        System.out.println(name1 == name2); // We expect a false return

        String name3 = new String("Bryan"); // We created an object, so it isn't in String Pool properly
        // If we compare name3 and name2, we expect a false return because we're comparing an object with an String value
        System.out.println("=====================================================");
        System.out.println(name3 == name2);
        // We can compare the intern value of this object and, in this case, we expect a true return
        System.out.println(name3.intern()==name2);


        // Now, we'll work with StringBuilder logic, working with time of processing

        long initialTime = System.currentTimeMillis();
        concatString(100);
        long finalTime = System.currentTimeMillis();
        System.out.println("Time to concatString method work properly with num of loops: "+(finalTime - initialTime)+"ms");
    }


    // Below, we built a logic loop to get how much time this method spend to end and
    // return to main method
    // Afterwards, we'll use a StringBuilder logic to get faster this result
    private static void concatString(int size){
        String text = " ";
        for (int i = 0; i < size; i++) {
            text +=i; // 0, 01, 012, 013
        }
    }
}
