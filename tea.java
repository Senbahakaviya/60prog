import java.util.*;
public class tea
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);

int n,m,i;
n=in.nextInt();
m=in.nextInt();
for(i=2;i<=m;i++)
n=n/2;
System.out.println(n);
}
}