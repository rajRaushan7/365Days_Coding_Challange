from itertools import combinations

num = int(input())

lst = input().split(' ')
n = int(input())

comb = list(combinations(lst, n))
alpha = []

for char in comb:
    ch = ''.join(char)
    alpha.append(ch)

count = 0
for char in alpha:
    if 'a' in char:
        count += 1

ans = count / (len(alpha))
print("{:.4f}".format(ans))
