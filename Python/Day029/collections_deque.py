from collections import deque

d = deque()
n = int(input())
for i in range(n):
    task = input()
    if task == 'pop':
        d.pop()
    elif task == 'popleft':
        d.popleft()
    else:
        command, num = task.split(' ')
        num = int(num)
        if command == 'append':
            d.append(num)
        elif command == 'appendleft':
            d.appendleft(num)
for char in d:
    print(char, end=' ')
