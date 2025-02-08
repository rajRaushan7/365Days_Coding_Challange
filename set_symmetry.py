n1 = int(input())
eng = set(input().split(' '))
n2 = int(input())
fren = set(input().split(' '))

ans = len(eng.union(fren)) - len(eng.intersection(fren))
print(ans)
