import java.util.Scanner;
public class palindrome{

	public static boolean isPal(int p){
		boolean pal = true;
		String m = String.valueOf(p);
		for(int i = 0; i < m.length(); i++){
			if(!(m.charAt(i) == m.charAt(m.length()-1-i))){
				pal = false;
				break;
			}
		}
		return pal;
		}


	public static int nextPal(int k){
		int npal = k+1;
		while(true){
			if(isPal(npal)){
				break;
			}
			npal ++;
			}
		return npal;
		}


	public static void main(String args[]){
		Scanner scan  = new Scanner(System.in);

		int k = scan.nextInt();

		int [] ins = new int[k];

		for(int i = 0; i < k; i++){
			ins[i] = scan.nextInt();
			}

		for(int value : ins){
			System.out.println(nextPal(value));

			}




	}


}
