def ispalindrome(n):
	n = str(n)
	for i in range(0,len(n)):
		if not n[i] == n[len(n)-i]:
			return false
	return true
