/**
 * INPUT : N = 4

Participant 1 : A  B  C  D  E  
Participant 2 : A  B  B  C  D  
Participant 3 : E  A  B  D  E  
Participant 4 : E  B  D  D  E  

KEY : E  B  C  D  E  

Scores : 
Participant 1 = 4
Participant 2 = 1
Participant 3 = 3
Participant 4 = 4

Highest Score :
Participant 1
Participant 4

 */
import java.util.*;
public class Quiz
{
    static char arr[][],key[];
    static int N,score[];
    public static void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter number of participants : ");
        N=sc.nextInt();
        if(N>3 && N<11)
        {
            arr=new char[N][5];
            key=new char[5];
            System.out.println("Enter answers of :");
            for(int i=0;i<N;i++)
            {
                System.out.println("Participant "+(i+1)+" : ");
                for(int j=0;j<5;j++)
                {
                    arr[i][j]=(sc.next()).charAt(0);
                }
            }
            System.out.println("Enter KEY :");
            for(int i=0;i<5;i++)
            {
                key[i]=(sc.next()).charAt(0);
            }
        }
        else
        {
            System.out.println("Invalid input");
            accept();
        }
    }

    public static void answers_key()
    {
        for(int i=0;i<N;i++)
        {
            System.out.print("Participant "+(i+1)+" : ");
            for(int j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.print("\nKEY : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(key[i]+"  ");
        }
    }
    
    public static void Scores()
    {
        int c=0;
        score=new int[N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(arr[i][j]==key[j])
                {
                    c++;
                }
            }
            score[i]=c;
            c=0;
        }

        System.out.println("\n\nScores : ");
        for(int i=0;i<N;i++)
        {
            System.out.println("Participant "+(i+1)+" = "+score[i]);
        }
    }

    public static int highScore()
    {
        int max=0;
        for(int i=0;i<N;i++)
        {
            if(max<score[i])
                max=score[i];
        }
        return max;
    }

    public static void dispHighest()
    {
        System.out.println("\nHighest Score :");
        for(int i=0;i<N;i++)
        {
            if(score[i]==highScore() )
            {
                System.out.println("Participant "+(i+1) );
            }
        }
    }

    public static void main(String[]args)
    {
        accept();
        answers_key();
        Scores();
        dispHighest();
    }
}