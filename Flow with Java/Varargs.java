public class Varargs {

    static int sum(int ...arr)
    {
        int result=0, c=0;
        System.out.println();
        if (arr.length>1)
        {
            for (int i : arr) {
                result+=i;
                c++;
                if(c==1)
                System.out.print(i);
                else
                System.out.print(" + " + i);
                
            }
            System.out.print(" = ");
        }
        else if(arr.length!=0)
            result = arr[0];
        return result;
    }
    public static void main(String[] args) {
        System.out.print(sum(1));
        System.out.print(sum(1,2,3));
        System.out.print(sum(1,2,3,4,5));
        System.out.print(sum());
        
        System.out.println();
    }
}
