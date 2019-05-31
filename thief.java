import java.util.*;
public class thief {
public static void main(String[] args) {
int a,b,out=0;
Scanner in=new Scanner(System.in);
a=in.nextInt();
b=in.nextInt();
for(int i=1;i<=a;i++) {

if(i%2!=0) {
out=out+b;
}
}
System.out.println(out);
}
}
