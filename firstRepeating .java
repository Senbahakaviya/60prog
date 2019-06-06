import java.util.*;
public class firstRepeating{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=in.nextInt();
		for(int j=0;j<n;j++){
count=0;
			for(int k=0;k<n;k++){
				if(arr[j]==arr[k]){
count++;
}
}
if(count<=0) {
					System.out.println(arr[j]);

break;
					
				}
			}
		
}
}
