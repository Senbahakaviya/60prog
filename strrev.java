import java.util.*;

public class strrev {
public static void main(String[] args) {
String s1;


Scanner s=new Scanner(System.in);
s1=s.nextLine();
String[] arr=s1.split(" ");
for(int i=arr.length-1;i>=0;i--) {
System.out.println(arr[i]);
}
}
}



