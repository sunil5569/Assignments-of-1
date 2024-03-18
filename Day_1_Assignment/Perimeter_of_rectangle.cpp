#include<iostream>
using namespace std;
int main()
{
	int length,width,perimeter;
	
	cout<<"Enter length and width:\n";
	cin>>length>>width;
	
	perimeter=(2*length)+(2*width);
	cout<<"\nPerimeter of rectangle: "<<perimeter;
}