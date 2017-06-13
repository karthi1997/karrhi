import java.util.*;
public class digitn
{
public static void main(String[] arg)
{
 Scanner s=new Scanner(System.in);
 int count=0,d,c;
 int n=s.nextInt();
 while(n>0)
 {
   n=n/10;
   count++;
   }
   System.out.println(count);
   }
}
