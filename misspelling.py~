

def misspell(n, word):
	m = ""
	for i in range(0,len(word)):
		if i+1 == n:
			continue		
		m+= word[i]
	return m

cases = int(raw_input())
ans = []
i = 0



for i in range(0, cases):
	i = raw_input().split()
	ans.append(misspell(int(i[0]), i[1]))

for i in range(0, cases):
	print i+1, ans[i]



