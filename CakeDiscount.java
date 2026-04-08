import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner hr = new Scanner(System.in);
		int N = hr.nextInt();
		int cost;
		
		if (N >= 5) {
		    cost = N * 85;
		} else {
		    cost = N * 100;
		}
        
        System.out.println(cost);
	}
}