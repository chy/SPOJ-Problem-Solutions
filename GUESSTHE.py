
def euclidGCD(a, b):
	while b!= 0:
		temp = b
		b = a % b
		a = temp
	return a

def LCM(a, b):
	return (a*b)/euclidGCD(a,b)

def main(divstring):
	if divstring == "Y":
		return 1
	if divstring == "N":
		return -1

	numdivs = []
	nondivs = []
	for i in range(0, len(strdivs)):
		n = i+1
		if strdivs[i] == 'N':
			nondivs.append(n)
		else:
			numdivs.append(n)
#	print [l for l in numdivs]
#	print [o for o in nondivs]

	if len(numdivs) == 0:
		return -1
	if len(numdivs) == 1: 
		for element in nondivs:
			if numdivs[0]%element == 0:
				return -1
			else:
				return numdivs[0]		

	lcm = LCM(numdivs[0], numdivs[1])
#	print "first lcm: ", numdivs[0], numdivs[1],": ", lcm
	for j in range(2, len(numdivs)):
#		print "J: ", j
#		t = lcm		
		lcm = LCM(lcm, numdivs[j])
#		print "LCM of: ", t, numdivs[j], ": ",lcm

	for element in nondivs:
		if lcm%element == 0:
			return -1
	
	return lcm


while True:
	strdivs = raw_input()
	if strdivs == '*':
		break
	print main(strdivs)	

	


		



