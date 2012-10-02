import math

def sieveOfErat(n):
	import math
	primes = [True] * (n+1)
	primes[0] = False
	primes[1] = False
	for i in range(2, int(math.sqrt(len(primes)))):
		if primes[i]:
			for j in range(i*i, len(primes), i):
				primes[j] = False
	return [i for i in range(len(primes)) if primes[i]]
	


def DimensionDistance(a, b, primes,case):
	factors = []
	apowers = []
	bpowers = []
	
	i = 0
	while (i < len(primes)) and (primes[i] <= a or primes[i] <= b):
		t = primes[i]
#		print "t:",t
		if a%t == 0 and not t in factors:
#			print t, "|", a
			factors.append(t)
#			print [element for element in afactors]
			apowers.append(0)
			bpowers.append(0)
		if b%t == 0 and not t in factors:
#			print t, "|", b
			factors.append(t)
#			print [item for item in bfactors]
			bpowers.append(0)
			apowers.append(0)
		i+= 1
#	print "Factors:", [el for el in factors]
	countera = a
	counterb = b
#	print "apowers, bpowers"
#	print [h for h in apowers]
#	print [h for h in bpowers]

	while(countera > 1 or counterb > 1):
		for j in range(0, len(factors)):
			if(countera%factors[j] == 0):
				countera /= factors[j]
				apowers[j] += 1
			if(counterb%factors[j] == 0):
				counterb /= factors[j]
				bpowers[j] += 1
#	print "apowers, bpowers"
#	print [h for h in apowers]
#	print [h for h in bpowers]

#	print "Powers of factors of a", [kaliph for kaliph in apowers]
#	print "Powers of factors of b", [pop for pop in bpowers]
	n = len(factors)
#	print "Number of axes: ", n

#	print "Powers of factors of a", [kaliph for kaliph in apowers]
#	print "Powers of factors of b", [pop for pop in bpowers]
	distance = 0
	for m in range(len(bpowers)):
		distance += abs(bpowers[m] - apowers[m])
	outp = str(case) +". " + str(n) + ":" + str(distance)
#	print "miffles"
	print outp

# END DIMENSION DISTANCE

primes = sieveOfErat(1000000) 

a = 1
b = 1
case = 0
while(a != 0 and b != 0):
	case += 1
	inp = raw_input().split()
	a = int(inp[0])
	b = int(inp[1])
	if (a == b == 0):
		break
	DimensionDistance(a, b, primes, case)


	



































