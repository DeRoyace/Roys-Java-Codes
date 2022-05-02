/**
 * Question:
Write a program to accept the year, month and the weekday name of the 1st day of that month and generate its calendar.

Example :

INPUT :
Year : 2016
Month : February
1st day of February : Monday

OUTPUT :

----------------------------
        February 2016
----------------------------
SUN MON TUE WED THU FRI SAT
----------------------------
    1   2   3   4   5   6
----------------------------
7   8   9   10  11  12  13
----------------------------
14  15  16  17  18  19  20
----------------------------
21  22  23  24  25  26  27
----------------------------
28  29                  
----------------------------

 *******************************************************************/
import java.util.*;
public class Calendar
{
    int mm, yyyy,wkd,tdays;
    String month, wday;
    String days[][];
    Calendar()
    {
        mm=yyyy=wkd=tdays=0;
        month=wday="";
        days=new String[5][7];
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                days[i][j]=" ";
            }
        }
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the year (yyyy) : ");
        yyyy=sc.nextInt();
        System.out.print("\nEnter the month name : ");
        month=sc.next()+sc.nextLine();
        System.out.print("\nEnter 1st day of "+month+" : ");
        wday=sc.nextLine();
        sc.close();
    }

    static int checkLY(int y)  // function to check Leap Year
    {
        if( (y%4==0 && y%100!=0) || y%400==0 )
            return 1;
        else 
            return 0;
    } //  end of checkLY()

    void weekDayPos()
    {
        int days1[]={0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days2[]={0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        String week[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        
        for(int i=1;i<=7;i++)
        {
            if(wday.equalsIgnoreCase(week[i]))
            {   
                wkd=i;  // stores the position( w.r.t array index ) of week day of 1st day of give month
                break;
            }
        }  // end of for loop
        
        for(int i=1;i<=12;i++)
        {
            if(month.equalsIgnoreCase(months[i]))
            {
                mm=i;
                if(checkLY(yyyy)==1)
                    tdays=days2[i];
                else
                    tdays=days1[i];
                break;
            }
        }
    }
    
    void fillCalendar()
    {
        weekDayPos();
        int k=0,flag=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                if(wkd>1)
                {
                    days[i][j]=" ";
                    wkd--;
                }
                else if(k<tdays)
                {
                    ++k;
                    String s=Integer.toString(k);
                    days[i][j]=s;
                    if(i==4 && j==6 && flag==0)
                    {   flag=1;
                        i=0;j=-1;
                    }
                }
                else
                {
                    break;
                }
            }
        }
    }

    void display()
    {
        System.out.println("---------------------------------------------------");
        System.out.println("                   "+month+" "+yyyy );
        System.out.println("---------------------------------------------------");
        System.out.println("SUN     MON     TUE     WED     THU     FRI     SAT");
        System.out.println("---------------------------------------------------");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<7;j++)
            {
                System.out.print(days[i][j]+"\t");
            }
            System.out.println();
            System.out.println("---------------------------------------------------");
        }
    }
    
    public static void main(String []args)
    {
        Calendar c = new Calendar();
        c.accept();
        c.fillCalendar();
        c.display();
    }
}
