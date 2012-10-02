#SPOJ FASHION : http://www.spoj.pl/problems/FASHION/. Christa Wimberley

def MMDS(men, women):
	men.sort()
	men = men[::-1]
	women.sort()
	women = women[::-1]
	s = 0 #sum
	m = len(men) #length of shorter list so it'll still work with uneven lists
	if len(women) < len(men):
		m = len(women)
	for i in range(0, m):
		s += men[i] * women[i] 
	return s

a = []

cases = int(raw_input())

for i in range(0, cases):
	n = raw_input()
	men = [int(x) for x in raw_input().split()] #men needs to be a list of integers, raw input gives a string
	women = [int(y) for y in raw_input().split()]
	a.append(MMDS(men, women))

print "\n".join([str(i) for i in a])
	




