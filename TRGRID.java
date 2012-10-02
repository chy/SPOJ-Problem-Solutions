import java.lang.*;
import java.util.*;

class TRGRID{

	static char direction(long n, long m){
		if(n>m){
			if(m%2==0) return 'U';
			if(m%2==1) return 'D';
			}

		if(n==m || n<m){
			if(n%2==0) return 'L';
			if(n%2==1) return 'R';		
		}
		return 0;
	}

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		StringBuilder output = new StringBuilder();
		int cases = scan.nextInt();
		int m = scan.nextInt(); int n = scan.nextInt();

		for(int i = 0; i < cases; i++){
			output.append(direction(n, m));
			if(i < cases-1){
				output.append("\n");
				n=scan.nextInt();
				m=scan.nextInt();
			}	
		}
		System.out.println(output);
	}
}
