import java.util.Scanner;

public class nrepeat {
	public static void main(String args[])
	{
		 Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    int flag=0;
		    int[] b=new int[n];
		    for(int i=0;i<a;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		    if(b[i]==i)
		    {
		    	System.out.print("the number " +b[i]+ " equal to its index "+i);
		    }System.out.println(" ");
		    }
		   
	}

}
