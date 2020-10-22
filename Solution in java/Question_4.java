public class prog10
{
	public static void main()
	{
	   int j=0,i=0,flag=0;
           long sum=2; 
	   for(i=3;i<2000000;i=i+2)
	   {
		
	    for(j=3;j*j<=i;j=j+2)
	    {
                if(i%j==0)
                {		
		   flag=1;
                   break;	
	        }
	        flag=0;
            }
            if(flag==0)
	     sum=sum+i;
        }        
        System.out.println("The sum of all the primes below two million="+sum);
   }    
} 
