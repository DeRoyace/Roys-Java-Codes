import java.util.Random;
import java.util.*;
public class Stone_Paper_Seissor_Cut
{
    static private int human, comp;
    static private String player;
    private static void points(int user, int pc)
    {
        if( (user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0) )
        {
            comp++;
        }
        else if(user==pc || user>2 || user<0 )
        {
            System.out.println("NO POINTS ADDED");
        }
        else
        {
            human++;
        }
        System.out.println("\nUSER points : "+human);
        System.out.println("BOT points: "+comp);
    }

    private static int playerHands(int num)
    {
        int flag=0;
        switch(num)
        {
            case 0:
            System.out.println(player +" : STONE");
            break;

            case 1:
            System.out.println(player +" : PAPER");
            break;

            case 2:
            System.out.println(player +" : SCISSOR");
            break;

            default:
            flag=1;
            System.out.println("USER : INVALID INPUT ");
            
        }
        return flag;
    }

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        player=""; 
        int n1=0, n2=0, flag=0;
        human=comp=0;
        System.out.println("\n-----------------------------------------------");
        for(int i=1;i<=10;i++)
        {
            System.out.println("                   ROUND "+i);
            player="USER";
            System.out.print("\nYOUR TURN : ");
            n1=sc.nextInt();
            System.out.println();
            flag=playerHands(n1);
            
            player="BOT";
            Random r=new Random();
            n2=r.nextInt(3);
            playerHands(n2);
            
            if(flag==0)
            {
                points(n1,n2);
                System.out.println("\n-----------------------------------------------");
            }
            else
                i--;
        }
        
        /** CHECKing WINNER **/
        if(human>comp)
        System.out.println("CONGRATULATIONS! YOU ARE THE WINNER.");
        else if(human==comp)
        System.out.println("-----------MATCH DRAW-----------");
        else
        System.out.println("BETTER LUCK NEXT TIME.");
        sc.close();
    }
}
