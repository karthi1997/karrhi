import java.io.*;
import java.util.*;
public class vowel
{
public static void main(String[] arg)
{
 Scanner s=new Scanner(System.in);
 String s1=s.nextLine();
 int flag=0,count=0;
 char[] c=s1.toCharArray();
 for(int i=0;i<c.length;i++)
 {
     if(flag==0)
 {
 if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
 {
  flag++;
  count++;
 }
       }
 }
 if(count==1)
 System.out.print("vowels");
 else
    System.out.println("consonants");
    
}
    }
