import java.util.*;
public class common {
public static void main(String[] args) {
int n1,n2,n3,i,j,k,ans=0;
Scanner in=new Scanner(System.in);
n1=in.nextInt();
n2=in.nextInt();
n3=in.nextInt();
int arr1[]=new int[n1];
int arr2[]=new int[n2];
int arr3[]=new int[n3];
for( i=0;i<n1;i++) {
arr1[i]=in.nextInt();
}
for( j=0;j<n2;j++) {
arr2[j]=in.nextInt();
}
for( k=0;k<n3;k++) {
arr3[k]=in.nextInt();
}

for(int x=0;x<n1;x++) {
 ans=ans+arr1[x];
for(int y=0;y<n2;y++) {
if(ans==arr2[y])

  for(int z=0;z<n3;z++) {
 if(ans==arr3[z]) 

System.out.println(ans);

}}}}
}




