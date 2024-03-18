#include<iostream>
using namespace std;
int main()
{
	int r;
	float surface_area;
	
	cout<<"Enter radius: ";
	cin>>r;
	
	surface_area=4*3.14*r*r;
	
	cout<<"\nSurface area of sphere: "<<surface_area;
}