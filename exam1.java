import java.io.*;
import java.util.*;
class exam1
{ 
    public static void main(String args[])
    { 
        Scanner object=new Scanner(System.in);
        int a[]=new int[100];
        int sum=0;
        int i;
        System.out.println("enter the size of the array");
        int n=object.nextInt();
        for(i=0;i<n;i++)
        { 
            a[i]=object.nextInt();
            sum=sum+a[i];
        }
        System.out.println(sum);

    }
}