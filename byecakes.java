import java.util.*;
import java.lang.Math.*;
class byecakes{
	public static void buywhat(int e, int f,int s, int m, int er, int fr, int sr, int mr){
		int [] x = {e,f,s,m};
		int [] xr = {er, fr, sr, mr};
		int [] toBuy = {0,0,0,0};
		
		for(int i = 0; i < 4; i++){
			if(x[i] < xr[i]) toBuy[i] = Math.abs(x[i]-xr[i]);
			if((x[i] + toBuy[i])%xr[i] != 0) toBuy[i] += (x[i] - x[i]%xr[i]);
		}
		for(int g : toBuy){System.out.print(g + " ");}System.out.println();

		int maxMultiple = (x[0] + toBuy[0])/xr[0];
		for(int j = 1; j < 4; j++){
			if((x[j] + toBuy[j])/xr[j] > maxMultiple) maxMultiple=(x[j] + toBuy[j])/xr[j];
		}
		System.out.println(maxMultiple);
		for(int g : toBuy){System.out.print(g + " ");}System.out.println();
		for(int t = 0; t < 4; t++){
			while((x[t] + toBuy[t])/xr[t] < maxMultiple) toBuy[t] += x[t];
		}
		for(int g : toBuy){System.out.print(g + " ");}System.out.println();
		
	}

	public static void main(String [] args){
	Scanner in = new Scanner(System.in);

	int e = 0; int f = 0; int s= 0; int m = 0;
	int er = 0; int fr=0; int sr=0; int mr=0;

	e = in.nextInt(); f = in.nextInt(); s=in.nextInt(); m =in.nextInt();
	er = in.nextInt(); fr = in.nextInt(); sr= in.nextInt();mr=in.nextInt();

	while(e!=-1){
		buywhat(e,f,s,m,er,fr,sr,mr);
		e = in.nextInt(); f = in.nextInt(); s=in.nextInt(); m =in.nextInt();
		er = in.nextInt(); fr = in.nextInt(); sr= in.nextInt();mr=in.nextInt();
	}




	}}
