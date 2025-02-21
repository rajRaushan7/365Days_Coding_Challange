from itertools import combinations_with_replacement

s, n = input().split(' ')
n = int(n)
ans = []

lst = []
for char in s:
    lst.append(char)
lst.sort()

s = ''.join(lst)
combinatn = list(combinations_with_replacement(s, n))

for char in combinatn:
    ans.append(''.join(char))
    
for char in ans:
    print(char)
