import java.util.*;
public class NumEx{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String s1=in.nextLine();
String[] s2=s1.split("[^0-9]");
for(int i=0;i<s2.length;i++)
{
System.out.println(s2[i]);
}
}
}