
/**
 * Q. Integer to Roman number conversion: 
 */
import java.util.*;

class Integer_Roman {
	// I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
	static String Rnum[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	static char ivalue(int d)	
	{
		char val = ' ';
		switch(d)
		{
			case 1:
			val = 'I';
			break;
            case 5:
            val = 'V';
            break;
			case 10:
            val = 'X';
            break;
			case 50:
            val = 'L';
            break;
			case 100:
            val = 'C';
            break;
			case 500:
            val = 'D';
            break;
			case 1000:
            val = 'M';
            break;
			default:
			val = ' ';
		}
		return val;
	}
	
	static String Int_R(int x)
	{
		int len = Integer.toString(x).length();
		if(len!=0)
		{
			int c = ( x % (int) Math.pow(10,len-1)) * (int) Math.pow(10,len-1);
			if(x>=1 && x<=10)
			{
				return Rnum[x];
			}
			else
			{
				if(ivalue(c)!= ' ')
				{
					x /= (int) Math.pow(10,len-1);
					return ivalue(c) + Int_R(x);
				}
				else
				{
					
				}