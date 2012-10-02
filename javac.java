import java.util.*;
import java.lang.*;

class javac{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		String input = in.next();
		String out = "";
		//check if the first or the last chars are _
		if(input.charAt(0) == '_' || input.charAt(input.length()-1)=='_'){
			System.out.println("Error!");
			continue;
		}
		
		//check if there are uppercase characters and underscores
		//I don't remember how to check for or convert uppercase in java...
		if((input.indexOf('_')!= -1) && !(input.toLowerCase().equals(input))){
			System.out.println("Error!"); 
			continue;
	}
		//check if the first letter is uppercase

		if(Character.isUpperCase(input.charAt(0))){
			System.out.println("Error!");
			continue;
		}
		
		//check if there are two or more underscores in a row
		if(input.indexOf('_') != -1){
			for(int i = 1; i < input.length(); i++){
				if(input.charAt(i-1) == '_' && input.charAt(i) == '_'){
					System.out.println("Error!");
					continue;
				}
			}

		}
				

		//now, if c++, convert to java
		if(input.indexOf('_')!= -1){
			for(int i = 0; i < input.length(); i++){

				if(input.charAt(i) == '_') continue;
				if(i > 0 && input.charAt(i-1) == '_'){ out += Character.toUpperCase(input.charAt(i)); continue;}
				out += input.charAt(i);
			}
			System.out.println(out);
			continue;
		} 


		//now, if java, convert to c++
		else{
			for(int i = 0; i<input.length(); i++){
				if(Character.isUpperCase(input.charAt(i))){
					out += '_';
					out += Character.toLowerCase(input.charAt(i));
				}
				else out += input.charAt(i);
			}
			System.out.println(out);	
			continue;
		}

	}
}}
