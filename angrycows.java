//AGGRCOW
import java.util.*;
import java.io.*;
import java.lang.*;

class Parser
{
   final private int BUFFER_SIZE = 1 << 16;

   private DataInputStream din;
   private byte[] buffer;
   private int bufferPointer, bytesRead;

   public Parser(InputStream in)
   {
      din = new DataInputStream(in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
   }

   public int nextInt() throws Exception
   {

      int ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = c == '-';
      if (neg) c = read();
      do
      {
         ret = ret * 10 + c - '0';
         c = read();
      } while (c > ' ');
      if (neg) return -ret;
      return ret;
   }

   public StringBuilder next() throws Exception
   {
      StringBuilder inputline = new StringBuilder("");
      int ret = 0;
      byte c = read();
      while (c != '\n'){
	inputline.append((char)c);
	c = read();
      }

      return inputline;
   }


   private void fillBuffer() throws Exception
   {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1) buffer[0] = -1;
   }

   private byte read() throws Exception
   {
      if (bufferPointer == bytesRead) fillBuffer();
      return buffer[bufferPointer++];
   }
}

class angrycows{

	static boolean validMin(int [] stalls, int numCows, int min){
		int cowsPlaced = 1; int lastFilled = 0;
		
		for(int i = 0; i < stalls.length;i++){
			if(stalls[i] - stalls[lastFilled] >= min){
				cowsPlaced++;
				lastFilled = i;
				if(cowsPlaced == numCows) return true;
			}
		}
		if(cowsPlaced == numCows) return true;
		return false; 
	}


	static int leastMin(int [] stalls, int numCows){
		System.out.println("Least Min Running ");

		int max = 1000000000;
		int min = 1; 
		int mid = (int) Math.floor((max-min)/2);
		int maxmin = 0; 
		while(min < max){
			System.out.println("Max: " + max);
			System.out.println("Min: " + min);
			System.out.println("Mid: " + mid);
			System.out.println("MaxMin: " + maxmin);
			if(validMin(stalls, numCows, mid)){
				System.out.println(mid + " is a valid min");
				maxmin = mid; 		
				min = mid;
				mid = (int) Math.floor((max-min)/2);
				if(mid < maxmin) break;
			}
			else{
				System.out.println(mid + " is not a valid min");
				max = mid;
			        mid = (int) Math.floor((max-min)/2);
				if(mid < maxmin) break;	
			}		
		}
		System.out.println("RETURNING MAXMIN: " + maxmin);
		return maxmin; 
	}

	public static void main(String args[]) throws Exception{

		Parser parse = new Parser(System.in);


/*		int numCases = parse.nextInt();
		int[] stalls = new int[1];
		int numCows= 0; int numStalls = 0;
		for(int i = 0; i < numCases; i++){
			numStalls = parse.nextInt();
			numCows = parse.nextInt();
			
			stalls = new int[numStalls]; 
			for(int j = 0; j < numStalls; j++){
				stalls[j] = parse.nextInt();
			}
			Array.sort(stalls);

//			System.out.println(leastMin(stalls, numCows));

		}
*/	}

}




