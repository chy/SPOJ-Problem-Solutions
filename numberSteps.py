# http://www.spoj.pl/problems/NSTEPS/

def numbers(x,y):
	x = int(x)
	y = int(y)
	if x == y == 0:
		return 0
	if x == y == 1:
		return 1
	if x%2==0 and y == x-2:
		return 2*x -2
	if x%2==0 and x == y:
		return 2*x
	if x%2!=0 and y == x-2:
		return 2*x-3
	if x%2!=0 and y == x:
		return 2*x-1
	return "No Number"
coordinates = []
testCases = int(raw_input())
for i in range(0, testCases):
	coordinates.append(raw_input())
for element in coordinates:
	print numbers(element.split()[0], element.split()[1])
