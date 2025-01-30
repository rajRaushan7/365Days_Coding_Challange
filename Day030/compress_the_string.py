n = input()
ans = []

current = n[0]
count = 0

for char in n:
    if char == current:
        count += 1
    else:
        t = (count, int(current))
        ans.append(t)
        count = 1
        current = char

last = (count, int(current))
ans.append(last)

for char in ans:
    print(char, end = ' ')
