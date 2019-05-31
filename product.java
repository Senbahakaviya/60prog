import java.util.*;
public class product {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int m,n,k,t=0,p=0;
n=s.nextInt();
int arr[]=new int[n];
for(m=0;m<n;m++) {
arr[m]=s.nextInt();
}
for(m=0;m<n;m++) {
for(k=m+1;k<n;k++) {
p=arr[m]*arr[k];
if(p > t) {
t=p;
}
}
}
System.out.println(t);
}
}
