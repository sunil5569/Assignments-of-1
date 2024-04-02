/*
 d.(For value of N is given as 6)
******
*****
****
***
**
*
*/

package Assignmentsloopandarray;
public class Pattern4
{
	public static void main(String[] args)
    {
        for (int i = 6; i  >= 1; i--)
        {
            for (int j = 1; j  <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

