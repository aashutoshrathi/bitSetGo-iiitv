import java.util.*;
import java.math.*;
public class Logic_Java_2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
            BigInteger n=in.nextBigInteger();
            BigInteger a=new BigInteger("2");
            BigInteger b=new BigInteger("5");
            BigInteger c=new BigInteger("7");
            BigInteger d=new BigInteger("9");			
            if((n.mod(a)==BigInteger.ZERO)&&(n.mod(b)==BigInteger.ZERO)&&(n.mod(c)==BigInteger.ZERO)&&(n.mod(d)==BigInteger.ZERO))
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
