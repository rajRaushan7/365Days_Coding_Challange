set1 = set(input().split(' '))
n = int(input())

isSuperSet = True
for i in range(n):
    s = set(input().split(' '))
    for char in s:
        if char not in set1:
            isSuperSet = False
            break
    if (not isSuperSet):
        break
        
print(isSuperSet)
