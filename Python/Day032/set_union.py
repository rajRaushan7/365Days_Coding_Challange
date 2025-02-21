n1 = int(input())
s1 = set(input().split(' '))
n2 = int(input())
s2 = set(input().split(' '))

u = s1.union(s2)

print(len(u))
