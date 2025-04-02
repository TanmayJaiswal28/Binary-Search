import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,k=0,mid=0,ns,s=0,e=9;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter The values in Ascending Order:");
            m[i]=sc.nextInt();
        }
        System.out.println("Enter The number to be Searched:");
        ns =sc.nextInt();
        while(s<=e)
        {
        mid=(s+e)/2;
        if(m[mid]<ns)
    s=mid+1;
if(m[mid]>ns)
e=mid-1;
if(m[mid]==ns)
{
    k=1;
    break;
}        }
if(k==1)
System.out.println("The NUmber is Present:"+ns);
else
System.out.println("The Number "+ns+"is not present.");
    }
}
