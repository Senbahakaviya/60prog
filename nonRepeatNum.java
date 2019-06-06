import java.util.*;
public class Repeat
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int b[]=new int[n];
	int c[]=new int[n];
		int count[]=new int[n];
	for(int i=0;i<n;i++){
	    b[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
	    for(int j=i+1;j<n;j++){
	        if(b[i]==b[j]){
	            b[j]=0;
	        }
	    }
	}
	for(int i=0;i<n;i++){
	if(b[i]!=0){
	    c[i]=b[i];
	
	    System.out.print(c[i]);
	}}
	for(int i=0;i<5;i++){
	    for(int j=0;j<n;j++){
	        if(c[i]==b[j]){
	            	            count[i]++;
	            	            
}
	    }
	    System.out.print(count[i]);
	}
	System.out.println();
for(int i=0;i<c.length;i++){
    if(count[i]==1)
    System.out.print(c[i]);
}

	}
}