n = int(input())
lst = input().split(' ')
d = {}

for char in lst:
    if char not in d:
        d[char] = 1
    else:
        d[char] += 1

ans = ''
for char in d:
    if d[char] == 1:
        ans = char
        exit
    
print(ans)
