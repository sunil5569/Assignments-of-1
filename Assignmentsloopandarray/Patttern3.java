/*c.(For value of N is given as 6)
*
**
***
****
*****
******
*/

package Assignmentsloopandarray;

public class Patttern3
{
    public static void main(String[] args)
    {
        for (int i = 1; i  <= 6; i++)
        {
            for (int j = 1; j  <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
