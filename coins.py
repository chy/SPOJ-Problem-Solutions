def convert(n):
	if n == 1: 
		return 1
	if n == 2:
		return 3
	if n == 3:
		return 3
	if n==4:
		return 5
	m = convert(n/2) + convert(n/3) + convert(n/4)
	if m>n:
		return m
	return n


m = raw_input()

while not(m == ""):
	print convert(int(m))
	m = raw_input()



