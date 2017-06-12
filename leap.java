import java.util.*;
public class leap
{
public static void main(String[] args)
{
 Scanner s=new Scanner(System.in);
 int year=s.nextInt();
 if(year%400==0||year%4==0)
 {
  System.out.println("year"+year+"is leap year");
 }
  else
  {
  System.out.println("year"+year+"is not leap year");
  }
  }
}
