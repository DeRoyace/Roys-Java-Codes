public class FindMaxCLA {
    public static void main(String[] args) {
        System.out.println("\nLargest element is " + findMax(args));
    }

    private static int findMax(String[] args) {
        int arr[]=new int[args.length];
        for(int i = 0; i < args.length; i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }

        System.out.println("Inputed user elements are: ");
        for(int j:arr)
            System.out.print(j+ "\t");

        int max=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
}

/**

rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ javac FindMaxCLA.java
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java FindMaxCLA 64 90 82 67 98 90 84 72 88 66 100
Inputed user elements are: 
64      90      82      67      98      90      84      72      88      66      100
Largest element is 100
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$ java FindMaxCLA 420 970 888 298 399 786 479
Inputed user elements are: 
420     970     888     298     399     786     479
Largest element is 970
rohit@rohit-HP-Notebook:/media/rohit/My drive 1/Desktop/My codes/Java in VSC$

*/
