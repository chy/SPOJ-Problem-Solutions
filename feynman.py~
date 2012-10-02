#SOJ Feynman: find the number of subsquares in a grid of n squares
# n = 1, s = 1 = 0 + 1
# n = 2, s = 5 = 1 + 4
# n = 3, s = 14 = 5 + 9
# n = 4, s = 30 = 14 + 16
#
# f(n) = (n-1) + n**2
# f(n) = (n * (n+1) * (2*n+1))/6  
# for some reason this problem doesn't accept python

def nsquares(n):
	return n*(n+1)*(2*n+1)/6

inp = 1
ls = []

while True:
	inp = int(input())
	if inp == 0:
		break	
	if inp > 0 and inp <= 100:
		ls.append(nsquares(inp))


for i in range(0, len(ls)):
	print ls[i]


