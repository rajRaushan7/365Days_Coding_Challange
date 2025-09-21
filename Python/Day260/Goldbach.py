'''
Goldbach's conjecture is one of the oldest and best-known unsolved problems in number
theory. It states that every even number greater than 2 is the sum of two prime numbers.
For Example:
12 = 5 + 7
26 = 3 + 23 or 7 + 19 or 13 +13 Write a function Goldbach(n) where n is a positive even number( n > 2) that returns a list of tuples. In each tuple (a, b) where a <= b, a and b should be prime numbers and the sum of
a and b should be equal to n.
'''

def is_Prime(n):
    if (n < 2):
        return False
    for i in range(2, int(n**0.5) + 1):
        if(n % i == 0):
            return False
    return True
    
def Goldbach(n):
    sn = 2
    ln = n-2
    ans = []
    while(sn <= ln):
        if(is_Prime(sn) and is_Prime(ln)):
            t = (sn, ln)
            ans.append(t)
        sn += 1
        ln -= 1
    return ans
        
n=int(input())
print(sorted(Goldbach(n)))