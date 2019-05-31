import java.util.*;
public class Strstr
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String str1=in.nextLine();
String str2=in.nextLine();
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
int l1,l2,count=0,i,k,temp=0,result=0,temp1=0;
l1=str1.length();
l2=str2.length();
for(i=0;i<l1;i++)
{
count=0;
temp=i;
if(ch1[temp]==ch2[0])
{
for(k=1;k<l2;k++)
{
++temp;
if(ch1[temp]==ch2[k])
count++;
}
if(count==l2-1)
{
result=1;
temp1=i;
}
}
}
if(result==1)
System.out.print(temp1);
else
System.out.print("-1");
}
}




