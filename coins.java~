import java.util.*;

class coins{

	public static long convert(long n){
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 3;
		if(n==4) return 5;
		if(n==3) return 3;
		if(n==5) return 5;
		if(n==6) return 6;
		if(n==7) return 7;
		if(n==8) return 8;
		if(n==9) return 9;

		return convert(n/2) + convert(n/3) + convert(n/4);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLong()){
			System.out.println(convert(scan.nextLong()));	
		}
	}
}
