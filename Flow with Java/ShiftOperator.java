public class ShiftOperator 
{
    public static void main(String[] args) 
    {
        int a = -16;
        a >>= 1; // [-16 / (2^1) ] = -8
        System.out.println(a); // -8
        a >>>= 1; 
        System.out.println(a); // 2,147,483,644
    }
}

/*
Explanation:

 '>>' is right shift operator
 '>>>' is zero-fill right shift operator

00010000 => 16 in binary form

11101111 => 1's complement form of 16
      +1
--------
11110000 => 2's complement form of 16
--------

-16 >> 1 = 01111000 => shifting by 1 place towards right

         = 10000111 => 1's complement form
                 +1
        --------------
           10001000 => -8

**************************************************************
32-bit representation:

-16 = 1111 1111 1111 1111 1111 1111 1111 0000 (base 2) 
-16 >>> 1 = 1111 1111 1111 1111 1111 1111 1111 1000 (base 2) 
          = 2,147,483,640 (base 10)

 -8 =  1111 1111 1111 1111 1111 1111 1111 1000 (base 2)
 -8 >>> 1 =  1111 1111 1111 1111 1111 1111 1111 1100 (base 2)
          = 2,147,483,644 (base 10)

*/
