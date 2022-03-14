public class IntArr_oct {
    public static void main(String[] args) 
    {
        int[] x = { 120, 200, 016 };
        for (int i = 0; i < x.length; i++) 
        {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

// OUTPUT: 120 200 14
// Explanation: 016 is an octal number, so its equivalent decimal number is 14.