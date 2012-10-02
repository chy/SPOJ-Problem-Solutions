#include <iostream>
using namespace std;

int main(){
	int n;
	cin >> n; 
	
	while(n!= 0){
		if(1<= n && n<=100){
			cout << n*(n+1)*(2*n+1)/6<< "\n";
		}
		cin >> n;
	}


	return 0;
}
