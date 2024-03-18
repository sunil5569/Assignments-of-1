/*2)accept a number from user only if number is perfectly div by 5 and 3 else till it is not given keep taking number.*/

#include <iostream>
using namespace std;
int main()
{
    int a;
    do
	 {
	cout<<"Enter a number that perfectly divisible by both 5 and 3: ";
        cin>>a;
        if (a % 5 != 0 || a % 3 != 0) 
       {
            cout <<"Invalid number. Please try again.";
        }
    } while
	(a % 5 != 0 || a % 3 != 0);
    cout<<"Thanks for entering a valid number.";
    return 0;
}
