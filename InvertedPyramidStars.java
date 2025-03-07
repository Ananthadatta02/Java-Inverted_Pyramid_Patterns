package star_patterns;

import java.util.Scanner;

/*
*********
 *******
  *****
   ***
    *
 */
public class InvertedPyramidStars 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=s.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<size;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=size;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
