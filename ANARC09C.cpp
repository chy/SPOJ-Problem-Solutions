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

	int primes[10] = {1};
	sieve_of_eratosthenes(primes, 10);
	for(int i = 0; i < 10; i++)
		cout << primes[i] << endl; 

}



