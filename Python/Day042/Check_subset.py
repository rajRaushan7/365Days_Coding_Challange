n = int(input())

for i in range(n):
    isSubset = True
    n1 = int(input())
    s1 = set(input().split(' '))
    n2 = int(input())
    s2 = set(input().split(' '))
    
    for char in s1:
        if char not in s2:
            isSubset = False
            break
    print(isSubset)
