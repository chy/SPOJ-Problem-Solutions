import math
def convert(nten, newbase): #converts a base ten number to a new base (newbase)
	new = []
	a = nten
	r = 0
	olda = nten	
	while True:
		olda = a
		print str(a) + " divided by "+ str(newbase) + " is " + str( a/float(newbase))
		a = a/float(newbase)
		if(a < 0):
			a = math.ceil(a)
		else:
			a = math.floor(a)
		print(a)
		r = olda - (newbase * a)
		print "remainder " + str(r)
		new.append(r)
		if(a == 0):
			break
	new.reverse()
	m = ""
	for i in new:
		m += str(int(i))
	print m
