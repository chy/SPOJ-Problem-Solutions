import java.util.*;
import java.lang.Math.*;

class AE00{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		int sum1 = 0;	
		for(int j = 1; j <= n; j++){
			sum1 = 0;	
			for(int i = 1; i <= Math.sqrt(j); i++){
				if(j%i==0){sum1++;}
			}
			sum += sum1;
		}
		System.out.println(sum);
	}}
	
