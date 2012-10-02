
#implements a prime number sieve http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes

def sieveofErat(lower, upper):
	primes = [True] * math.abs(upper - lower)
	for i in range(2,len(primes)):
		l = 2
		p = lower + primes.index(i)
		while (p * l) < upper:
			if primes[p * l] == True:
				primes[p*l] = False				
			l += 1
	return primes
	





numcases = raw_input()

cases = []

for i in range(0, int(numcases)):
	m = raw_input().split()
	cases.append(m)	

print "\n"

for case in cases:
	lower = int(case[0])
	upper = int(case[1])
	v = sieveofErat(upper)
	for prime in v:
		if (prime > lower or prime == lower) and (prime < upper or prime == upper):
			print prime
	print "\n"



#def sieveofErat(lower, upper):
#	primes = [True] * math.abs(upper - lower)
#	for i in primes:
#		l = 2
#		while i * l <= primes[-1]:
#			if i * l in primes:
#				primes[primes.indexof(i*l)] = False				
#			l += 1
#	return primes

















l


