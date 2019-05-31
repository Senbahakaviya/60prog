import java.util.*;
public class gright {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int m,n,k,t=0;
n=s.nextInt();
int arr[]=new int[n];
for(m=0;m<n;m++) {
arr[m]=s.nextInt();
}
for(m=0;m<n-1;m++) {
t=0;
for(k=m+1;k<n;k++) {
if(arr[k]>t) {
t=arr[k];
}
}
System.out.println(t);
}
System.out.println("-1");
}

}