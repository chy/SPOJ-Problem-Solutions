def primes(n): 
	if n==2: return [2]
	elif n<2: return []
	s=range(3,n+1,2)
	mroot = n ** 0.5
	half=(n+1)/2-1
	i=0
	m=3
	while m <= mroot:
		if s[i]:
			j=(m*m-3)/2
			s[j]=0
			while j<half:
				s[j]=0
				j+=m
		i=i+1
		m=2*i+3
	return [2]+[x for x in s if x]

numcases = raw_input()

cases = []

for i in range(0, int(numcases)):
	m = raw_input().split()
	cases.append(m)	

print "\n"

for case in cases:
	lower = int(case[0])
	upper = int(case[1])
	v = primes(upper)
	for prime in v:
		if (prime > lower or prime == lower) and (prime < upper or prime == upper):
			print prime
	print "\n"

