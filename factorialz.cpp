#include <iostream>
#include <math.h>

using namespace std;

//trailing_zeros(n) computes the number of zeros at the end of n!
// the number of zeros is equal to the number of factors of 10 in n!
// that is, the number of multiples of 5 in n!. pair each with a 2 from
// an even, and you have a 10...
//every power 5**n has n factors of 5. 
// so Z(n) = n/5 + n/5**2 + n/5**3 + ... + n/5**p where 5**p is the 
// largest power of 5 less than n. p = log(n)/log(5)


int trailing_zeros(int n){
	int num_zeros = 0;
	for(int p = 1; pow(5, p) < n; p++ ){
		num_zeros += n/pow(5,p);
	}	
	return num_zeros;
	}



int main(){ 
	int num_cases = 0; cin >> num_cases;
	int n = 0; cin >> n;
	for(int i = 0; i < num_cases; i++){
		cout << trailing_zeros(n) << endl;
		if(i < num_cases -1){cin >> n;}
	}

	return 0;
}

	
