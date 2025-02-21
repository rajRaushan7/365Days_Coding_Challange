import math
import os
import random
import re
import sys

if __name__ == '__main__':
    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    arr = []

    for _ in range(n):
        arr.append(list(map(int, input().rstrip().split())))

    k = int(input())
    
    lst = []
    s = []
    
    for char in arr:
        lst.append(char[k])
    lst.sort()
    
    for i in range(len(arr)):
        for j in range(len(lst)):
            if lst[i] == arr[j][k]:
                s.append(arr[j])
                del arr[j]
                break
        
    for char in s:
        for c in char:
            print(c, end=' ')
        print('', end='\n')
