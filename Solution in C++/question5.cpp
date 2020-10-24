// evenly divisible 
#include<iostream>
using namespace std;
#include<conio.h>
#include<stdlib.h>
long long check(long long x,long long y)
{
	if(y==0)
	 return x;
	else
	 return check(y,x%y);
}
long long lcm(int arr[])  
{
	long long a=arr[0];
	for(int i=1;i<20;i++)
	{
		a=((arr[i]*a)/check(arr[i],a));
	}
	return a;
}
int main()
{
	system("cls");
	int p[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	cout<<lcm(p);
	getch();
	
}
