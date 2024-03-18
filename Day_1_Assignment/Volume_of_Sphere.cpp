#include<iostream>
using namespace std;
int main()
{
	int r;
	float volume;
	
	cout<<"Enter radius: ";
	cin>>r;
	
	volume=((4/3)*3.14*r*r*r);
	
	cout<<"\nVolume of sphere: "<<volume;
}