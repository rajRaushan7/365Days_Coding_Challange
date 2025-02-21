num = int(input())
set_elements = set(map(int, input().split(' ')))

n = int(input())
for i in range(n):
    command = input()
    if command == 'pop':
        set_elements.pop()
    else:
        cmd, elem = command.split(' ')
        elem = int(elem)
        if cmd == 'remove':
            set_elements.remove(elem)
        elif cmd == 'discard':
            set_elements.discard(elem)
            
sum = 0
for char in set_elements:
    sum += char
    
print(sum)
