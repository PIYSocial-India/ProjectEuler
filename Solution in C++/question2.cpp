//even fibbo
#include<iostream>
using namespace std;
#include<conio.h>
#include<stdlib.h>
int main()
{
	system("cls");
  	long long n=4000000;
  	if(n<2)
  	{	
   	exit (0);
  	}
 	long long x=1,y=2,sum=0,z=0;
 	while(1==1)
  	{
   		if(x>=n)
     	break;
   		if(x%2==0)
     	sum=sum+x;
   		z=x+y;
   		x=y;
  		y=z;
  	}	
 	cout<<sum;
	getch();
}
