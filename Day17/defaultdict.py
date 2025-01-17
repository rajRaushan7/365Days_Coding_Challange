from collections import defaultdict

g1, g2 = input().split(' ')
g1, g2 = int(g1), int(g2)

d = defaultdict(list)

for i in range(g1):
    ch = input()
    d[ch].append(str(i+1))
    
for j in range(g2):
    c = input()
    if c in d:
        lst = d[c]
        ans = ' '.join(lst)
        print(ans)
    if c not in d:
        print('-1')
