/*h.(For value of N is given as 5)

    1
   232
  34543
 4567654
567898765
*/
package Assignmentsloopandarray;

public class Pattern8 
{
public static void main(String args[])
		{
			
			int n = 5, i, j,
			num = 1, gap;
			gap = n - 1;
			for ( j = 1 ; j <= n ; j++ )
			{
			num = j;
			for ( i = 1 ; i <= gap ; i++ )
				System.out.print(" ");
			gap --;
			for ( i = 1 ; i <= j ; i++ )
			{
				System.out.print(num);
				num++;
			}
			num--;
			num--;
			for ( i = 1 ; i < j ; i++)
			{
				System.out.print(num);
				num--;
			}
			System.out.println();
			}
		}
	}

