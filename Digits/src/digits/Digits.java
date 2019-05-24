
    
package digits;
import java.util.ArrayList;
import java.util.Iterator;
public class Digits 
{
int value;
int length;
Digits(int a)
{value =a;
}
Digits(int a,int l)
{
    value =a;
    length=l;
}
public int count(int x)
{
    int r,c=0;
    while(x!=0)
    {r=x%10;
    c++;
    x=x/10;}
    length=c;
    return length;
    
}
public void findFreq()
{
   int dig[]=new int[length];
   String a=Integer.toString(value);
   int digcount=0;
   int i,j;
   System.out.println("Number  "+value);
   System.out.println("Digit"+"\t"+"Frequency");
   char numarray[]={'0','1','2','3','4','5','6','7','8','9'};
   for(i=0;i<numarray.length;i++)
   {   digcount=0;
       for(j=0;j<a.length();j++)
       {
           if(numarray[i]==a.charAt(j))
             digcount++;
           
       
   }
       if(digcount!=0)
       System.out.println(numarray[i]+"\t"+digcount);
       
}
   

}
}

