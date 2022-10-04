package count;

import java.util.Scanner;





public class runCount {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 3;
		// int size = 5;
		int [][] record = new int[5][size];
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<size;j++)
			{
				record[i][j]=0;
			}
		}
		while(true)
		{	
			System.out.println("Please input");
			Scanner in = new Scanner(System.in);
			String input = in.next();
			
			for(int i=0; i<size;i++)
			{
				record[judgement(input.charAt(i))][i]++;
				System.out.println(judgement(input.charAt(i)));
			}
			
			System.out.println("Now the record");
			for(int i=0; i<5;i++)
			{
				for(int j=0;j<size;j++)
				{
					System.out.print(record[i][j]+" ");
				}
				System.out.println(" ");
			}
			
			
		}		
	}

	private static int judgement(char charAt) {
		// TODO Auto-generated method stub
		int ret=100;
		// I just hate switch case lol
		if(charAt == 'A') 
		{
			ret=0;
		}
		if(charAt == 'B') 
		{
			ret=1;
		}
		if(charAt == 'C') 
		{
			ret=2;
		}
		if(charAt == 'D') 
		{
			ret=3;
		}
		if(charAt == 'E') 
		{
			ret=4;
		}
		
		
		return ret;
	}

}