public class Prog6
  {
    public static void main()
      {
        int x=0,y=0,i=0,j=0;
        for(i=1;i<=100;i++)
          {
            x=x+(i*i);
          }
         for(j=1;j<=100;j++)
          {
            y=y+j;
          }
         System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum="+((y*y)-x));
       }
   }
