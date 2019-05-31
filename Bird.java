import java.util.*;
public class Bird
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
int n,one=0,two=0,three=0,four=0,five=0,i;
n=in.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
if(arr[i]==1)
one++;
else if(arr[i]==2)
two++;
else if(arr[i]==3)
three++;
else if(arr[i]==4)
four++;
else
five++;
}
if(one>=two && one>=three && one>=four && one>=five)
System.out.print("1");
else if(two>=one && two>=three && two>=four && two>=five)
System.out.print("2");
else if(three>=one && three>=two && three>=four && three>=five)
System.out.print("3");
else if(four>=one && four>=two && four>=three && four>=five)
System.out.print("4");
else
System.out.print("5");
}
}
INPUT:11  1,2,3,4,5,4,3,2,1,3,4
OUTPUT:3
