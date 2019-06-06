import java.util.*;
public class miss {
public static void main(String[] args) {
int i,count=0,n,j;
Scanner in=new Scanner(System.in);
n=in.nextInt();
int arr[]=new int[n];
Arrays.sort(arr);
for(i=0;i<n;i++){
arr[i]=in.nextInt();
}

for(j=0;j<n-1;j++){
count++;
if(arr[j]!=count) {
System.out.println(arr[j]-1);
break;
}
}

if (count==n) {
System.out.println("-1");
}
}
}
