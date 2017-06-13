import java.util.*;
public class revdig
{
 public static void main(String[] arg)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int a=0,rem=0;
   while(n>0)
   {
    rem=n%10;
    n=n/10;
    a=a*10+rem;
    }
    System.out.print(a);
    }
    }
