#include<iostream.h>
#include<conio.h>
void sum()
{ int x=999;

long int sum=0;
for(int i=0;i<=x;i++)
  {
  if((i%3==0)||(i%5==0) )
   {
   sum=sum+i;
   }
  }
  cout<<sum;
}

void main()
{           clrscr();
sum();
getch();
}