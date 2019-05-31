import java.util.*;
public class TimeM{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
String hh=in.nextLine();
String mm=in.nextLine();
String ss=in.nextLine();
System.out.println(hh+":"+mm+":"+ss+"am");
int hour=Integer.parseInt(hh);
hour=hour+12;
String m= hour+":"+mm+":"+ss+"pm";
System.out.println(m);
}
}