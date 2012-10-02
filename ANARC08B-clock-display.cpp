#include <iostream> 
#include <string>
using namespace std;

template <typename T>
T StringToNumber ( const string &Text ){                             
	stringstream ss(Text);
	T result;
	return ss >> result ? result : 0;
}

int main(){

int num_to_code [] = {63, 10, 93, 79, 106, 103, 119, 011, 127, 107};
int code_to_num [128];
	code_to_num[63] = 0;
	code_to_num[10] = 1;
	code_to_num[93] = 2;
	code_to_num[79] = 3;	
	code_to_num[106] = 4;
	code_to_num[103] = 5;
	code_to_num[119] = 6;
	code_to_num[11] = 7;
	code_to_num[127] = 8;
	code_to_num[107] = 9;

string input = "";
cin >> input; 
while(!(input == "BYE")){
	cout << input<< endl;
	cin >> input;
}

return 0;
}
