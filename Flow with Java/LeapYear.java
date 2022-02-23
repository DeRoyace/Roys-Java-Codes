public class LeapYear
{
    static boolean isLeapYear(int y)
    {
        if( (y%4==0 && y%100!=0) || y%400==0)
            return true;
        return false;
    }
    public static void main(String []args)
    {
        int yr=1800;
        System.out.println("Is "+yr+ " a leap year? "+ isLeapYear(yr));
    }
}
