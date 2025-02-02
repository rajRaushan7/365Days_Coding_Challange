n = int(input())
for i in range(n):
    size = int(input())
    block = list(map(int, input().split(' ')))
    
    c = block[0] if block[0] > block[-1] else block[-1]
    block.sort()
    if c == block[-1]:
        ans = True
    else:
        ans = False
        
    if ans:
        print('Yes')
    else:
        print('No')
