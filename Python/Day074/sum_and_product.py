import numpy as np

n, m = input().split(' ')
n = int(n)
m = int(m)

mat = []

for _ in range(n): 
    row = list(map(int, input().strip().split(' ')))
    mat.append(row)
    
arr = np.array(mat)
ans = np.sum(arr, axis=0)

product = 1
for char in ans: 
    product *= char
    
print(product)
