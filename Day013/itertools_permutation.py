from itertools import permutations

string, length = input().split(' ')
length = int(length)

result = list(permutations(string, length))

r = []

for t in result:
    t = list(t)
    char = ''.join(t)
    r.append(char)
r.sort()

for char in r:
    print(char)
