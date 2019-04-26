package Qn1;

public class TwelveInts {
    public static void main(String args[])
    {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int count = 0; count<(intArray.length); ++count)
            System.out.print(intArray[count] + ", ");
        System.out.println("");
        System.out.println("and");
        for (int count = 0; count<(intArray.length); ++count)
            System.out.print(intArray[intArray.length - count -1] + ", ");

    }
}
