public class Prog9
{
    public static void main ()
    {
        int a=0,b=0,c=0,flag=0,pro=1;
        
        for(a=1;a<=1000;a++)
        {
            for(b=a+1;b<=1000;b++)
            {
                for(c=b+1;c<=1000;c++)
                {
                    if(((a*a+b*b)==(c*c)))
                    {
                        if((a+b+c)==1000)
                        {
                            flag=1;
                            pro=a*b*c;
                            break;
                        }
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);
        System.out.println("The value of c="+c);
        System.out.println("The product of abc="+pro);
    }
}
