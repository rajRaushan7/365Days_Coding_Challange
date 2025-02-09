n = int(input())
set1 = set(input().split(' '))
t = int(input())

for i in range(t):
    task, num = input().split(' ')
    set2 = set(input().split(' '))
    if task == 'intersection_update':
        set1.intersection_update(set2)
    elif task == 'difference_update':
        set1.difference_update(set2)
    elif task == 'symmetric_difference_update':
        set1.symmetric_difference_update(set2)
    elif task == 'update':
        set1.update(set2)
        
s = 0
for char in set1:
    s += int(char)
    
print(s)
