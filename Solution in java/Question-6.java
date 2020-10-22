public class Prog4
  {
    public static void main ()
      {
        int pro=0,i=0,j=0,rev=0,max=0,d=0,bk;
        for(i=100;i<=999;i++)
          {
            for(j=100;j<=999;j++)
              {
                pro=i*j;
                bk=pro;
                while(pro!=0)
                  {
                    d=pro%10;
                    rev=rev*10+d;
                    pro=pro/10;
                  }
                    if(bk==rev)
                     {
                        if(bk>max)
                        {
                           max=bk;
                        }
                      }
                    rev=0;
               }
           }
              System.out.println("The largest palindrome="+max);
      }
  }
