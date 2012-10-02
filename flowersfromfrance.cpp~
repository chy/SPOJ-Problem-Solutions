#include <iostream>
#include<string>
using namespace std;

char is_tautogram(string possible_tautogram){

	//convert string to lowercase

	for(int i = 0; i < possible_tautogram.length(); i++){
		if(65 <= possible_tautogram[i] && possible_tautogram[i] <= 90){
			possible_tautogram[i] += 32;
		}
		if(i > 0 && possible_tautogram[i-1] == ' ' && possible_tautogram[i] != possible_tautogram[0]){
			return 'N';
		}
	}

	return 'Y';
	
	}



int main(){

	string possible_tautogram = "";
	getline(cin, possible_tautogram);

	while(possible_tautogram != "*"){ 
		cout << is_tautogram(possible_tautogram) <<endl;
		getline(cin,possible_tautogram);
	}
}





