package GatheringProjects.FourthProject.Arrays.Execute;

/*
    Make an array built by 6 integers, then
    print them out in reversed view
 */
public class FirstArraySession {
    public static void main(String[] args) {
        int[] firstArray = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(firstArray);

        for(int count :firstArray){
            System.out.println(count);
        }
        System.out.println("====================");
        for(int count = (firstArray.length-1); count >= 0; count--){
            System.out.println(firstArray[count]);
        }
    }
}
