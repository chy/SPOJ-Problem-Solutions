//http://www.spoj.pl/problems/PRIME1/
/*
Every integer has a prime divisor <= its square root. This computes and stores the primes up to the square root of the largest input (10**9), then tests if each input is divisible by one of them. If it is, it's composite; else, it's prime and gets printed. 
*/

#include<iostream>
#include<math.h>
#include<stdlib.h>

using namespace std;

void sieve_of_eratosthenes(int *prime_array, int n){ //n is the length of the array

	for(int r = 2; r <= n; r++){
		prime_array[r] = 1;
	}
	
	for(int i = 2; i*i <= n; i++){
		if(prime_array[i]){
		
		for(int j = i*i; j <= n; j+= i){//each j is a multiple of i , j >= i**2
			prime_array[j] = 0; // set j false
			}		
		}

	}
}


int main(){
	int primes[31622]; //sqrt 10**9, the largest input. 
	sieve_of_eratosthenes(primes,31622) ; 

	int num_cases = 0;cin >> num_cases;
	unsigned long m = 0; unsigned long n = 0;
	cin >> m; cin >> n;
	
	for(int t = 0; t < num_cases; t++){ //for each case
		cout << " CASE : " << t<< endl;
		
		for(int i = m; i <= n; i++){//for each number between m and n you want to test
		cout << "is " << i << " prime? " << endl;
			
			for(int j = 0; j*j <= n; j++){ //go through primes from 2 to root n
			cout << " J: " << j << endl;
				if(primes[j] == 1 && i % j == 0){
					cout << i << " is not prime because " << j << " | " << i << endl; 						cout << "i --> i+1" << endl;
					break;
				}			
			}
			cout << "FOUND A PRIME: " << i << endl;
		}

		if(t < num_cases-1) {cin >> m; cin >> n;}
	}


}


