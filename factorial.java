import java.util.*;
public class factorial
{
 public static void main(String[] arg)
 {
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int sum=1;
  for(int i=1;i<=n;i++)
  {
      {
    sum=sum*i;
    }
  }
    System.out.println(sum);
    }
}
