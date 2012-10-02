
def isTautogram(sentence):
	sentence = sentence.split()
	firstLetter = sentence[0][0]
	for i in sentence:
		if not i[0].lower() == firstLetter.lower():
			return False
	return True
		
m = 0

while True:
	m = raw_input()
	while not m==None:
		if(isTautogram(m)):
			print 'T'
		else:
			print 'F'


