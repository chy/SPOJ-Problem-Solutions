import java.util.*;
import java.lang.Math.*;

class divsum{

	public static int sumd(int n){
		int sum = 1; //n has at least two divisors: n and 1
		double sqrt = Math.sqrt(n);
		if(n%sqrt == 0) sum += sqrt;
		int step = 1;
		int initialI = 2;
		if(n%2!=0){ step = 2; initialI = 3;} //no odd number is divisible by an even number. 2k*2k = 4k even 2k(2k+1) = 4k**2+2k even.

		for(int i=initialI; i < sqrt; i+=step){
			if(n%i == 0){
				sum += i;
				sum += n/i;
			}
		}
		return sum;
	}

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int numCases = scan.nextInt();
		for(int i = 0; i < numCases; i++){		
			n = scan.nextInt();
			System.out.println(sumd(n));
		}
	}
}
