import java.util.*;
public class Rev{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int i,j,k,temp=0;
int n=in.nextInt();
int[] a=new int[n];
for(i=0;i<a.length;i++)
{
a[i]=in.nextInt();
}
for(k=0;k<=n/2;k++) {
temp=a[k];
a[k]=a[n-1-k];
a[n-1-k]=temp;
}
for(j=0;j<n;j++) {
System.out.println(a[j]);
}
}
}