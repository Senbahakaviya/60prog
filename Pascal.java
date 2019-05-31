import java.util.*;
public class Pascal{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int c=1;
int n=in.nextInt();
for(int i=0;i<=n;i++)
{
for(int k=n-i;k>=0;k--)
{
System.out.print(" ");
}
for(int j=0;j<=i;j++){
if(j==0||i==0)
c=1;
else
c=c*(i-j+1)/j;
System.out.print(" "+c);
}
System.out.println();
}
}
}