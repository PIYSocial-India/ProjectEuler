public class Prog7 
{
    public static void main()
	{
	    int i=3,ctr=2,j=0,flag=0;
	    double x=0;
	    while(ctr<=10001)
	    {
	        x=Math.sqrt(i);
	        for(j=3;j<=x;j=j+2)
	        {
	            if(i%j==0)
	            {
	               flag=1;
	               break;
	            }
           }
                i=i+2;
                if(flag==0)
                ctr++;
                flag=0;
       }
            System.out.println("The 10001st prime number ="+(i-2));
    }
}
