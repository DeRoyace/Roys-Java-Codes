class ConditionalOperator
{
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        if(s1 == s2) // s1 and s2 is refering to same string pool (TRUE condition)
            System.out.println("s1 and s2 are Equal.");
        if(s2 == s3) // FALSE Condition
        {
            /** 
             * s3 is an string object so it is not stored in string pool.
             * s2 value is stored in string pool.
             */
            System.out.println("s2 and s3 are equal.");
        }
        System.out.println(s2.equals(s3)); // true
        System.out.println(s3.equals(s2)); // true
        System.out.println("End of main()");
    }
}

/*
OUTPUT:
s1 and s2 are Equal.
true
true
End of main()
*/
