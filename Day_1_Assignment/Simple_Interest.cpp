#include<iostream>
using namespace std;
int main()
{
	int p,r,t,si;
	
	cout<<"Enter principle amount rate of interst and time period:\n";
	cin>>p>>r>>t;
	
	si=p*r*t;
	
	cout<<"\nSimple interst: "<<si;
}