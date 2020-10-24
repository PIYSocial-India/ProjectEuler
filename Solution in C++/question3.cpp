//largest prime factor
#include<iostream>
using namespace std;
#include<conio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
	system("cls");
	long long i=0;
	long long x=600851475143;
	long long a=x;
	for(i=2;i<=x;i++)
	{
 		if(x%i==0)
 		{
  			x=x/i;
  			i--;
 		}
	}
	cout<<"The largest prime factor of "<<a<<" is "<<i;
 	getch();
}
