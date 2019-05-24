

import primespackage.Primes;
import java.util.Scanner;
public class TwinPrimes {
    
    public static void main(String[] args)
    {
        Primes pr=new Primes();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number : ");
        int s=sc.nextInt();
        System.out.print("Enter ending number : ");
        int e=sc.nextInt();
        System.out.println("Twin primes in the given range are : ");
        int i;
        for(i=s;i<=e-2;i++)
        {
            int m=i;
            int n=i+2;
            if(pr.checkforPrime(m)&&pr.checkforPrime(n))
                System.out.println("("+m+" , "+n+")");
        }
    }
}
