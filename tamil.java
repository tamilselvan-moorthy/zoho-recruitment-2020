import java.util.*;
public class tamil {
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the String");
     String s1=s.nextLine();
     int l=s1.length();
     char a[]=new char[l];
     int mid=l/2;
     printpattern(a,mid,l,s1);
    }
    public static void printpattern(char[] a, int mid, int l,String s1)
    {
		int k=0;
	     for(int i=mid;i<s1.length();i++)
	     {
	         a[k++]=s1.charAt(i);
	     }
	     int i=0;
	     while(i<mid)
	     {
	         a[k++]=s1.charAt(i);
	         i++;
	      }
	     for(i=0;i<s1.length();i++)
	     {
	    	 k=0;
	         for(int j=0;j<s1.length();j++)
	         {
	        	 if(j<l-1)
	        	 {
	        		 System.out.print(" ");
	        	 }
	        	 if(j>=l-1)
	        	 {
	        		 System.out.print(a[k++]);
	        	 }
	         }
	         l--;
	         System.out.println();
	     }
	}
}
