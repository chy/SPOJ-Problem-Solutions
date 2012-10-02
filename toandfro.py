
def decrypt(message, columns):
	array = []
	decrypted = ""
	index = 0
	while len(array) < len(message)/columns:
		array.append(message[index: index+columns])
		index += columns
	for i in range(0, len(array)):
		if(i%2 != 0):
			array[i] = array[i][::-1]
	for m in range(0, columns):
		for element in array:
			decrypted += element[m]
	return decrypted
messages = []
columns = []
	

cols = int(raw_input())

while not cols == 0:
	columns.append(cols)
	message = raw_input()
	messages.append(message)
	cols = int(raw_input())

for i in range(0, len(columns)):
	print decrypt(messages[i], columns[i])


