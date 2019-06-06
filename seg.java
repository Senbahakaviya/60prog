import java.util.*;
public class seg {
public static void main(String[] args) {
int n,i,j;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int arr[]=new int[n];
for(i=0;i<n;i++) {
arr[i]=s.nextInt();
}
 for ( i = 0, j = arr.length-1; i < j;) {
   if (arr[i] == 1) {

    if (arr[j] == 0) {
     arr[i] = 0;
     arr[j] = 1;
    }
    j--;
   } else {
    i++;
   }
  }

  for ( i = 0; i < arr.length; i++) {
   System.out.println(arr[i] + ", ");
  }
 }
}

