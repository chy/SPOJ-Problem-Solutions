# """Your task is to add two reversed numbers and output their reversed sum. Of course, the result is not unique because any particular number is a reversed form of several numbers (e.g. 21 could be 12, 120 or 1200 before reversing). Thus we must assume that no zeros were lost by reversing (e.g. assume that the original number was 12)."""


#reverses the digits of a number n 
def rev(n):
   if(len(str(n)) <2): # if n has fewer than two digits, it is its reverse
        return n
   else:  
        v = ""
        i = 1
        while(i <= len(str(n))):
            v+=str(n)[-i]
            i +=1
        return int(v)    
#example run: 4321. len(str(4321)) > 1 so n%10 = 1 is returned plus the reverse of (432) which is 234. So 1234 is returned. 

def addrev(n, m):
    return rev(rev(n) + rev(m))

#this returns the reverse of the reverse of n plus the reverse of m. 
#example run: 234 + 114. rev(234) = 432; rev(114) = 411. 432+411 = 843. rev(843) = 348. 

cases = input()
m = []
results = []

for i in range(0, cases):
    m = raw_input().split()
    results.append(addrev(int(m[0]) , int(m[1])))

for i in results:
    print( i )    
