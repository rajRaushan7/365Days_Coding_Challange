'''
Write a function find_Min_Difference(L, P) that accepts a list L of integers and P (positive integer) where the size of L is greater than P. The task is to pick P different elements from the list L, where the difference between the maximum value and the minimum value in selected elements is minimum compared to other differences in possible subset of p elements. The function returns this minimum difference value.
Note - The list can contain more than one subset of p elements that have the same minimum difference value.
'''

def sort(L):
    for i in range(len(L)):
        for j in range(i, len(L)):
            if(L[i] > L[j]):
                temp = L[i]
                L[i] = L[j]
                L[j] = temp

def find_Min_Difference(L, P):
    sort(L)
    min = L[len(L)-1]
    si = 0
    ei = P-1
    while(ei < len(L)):
        diff = L[ei] - L[si]
        if(diff < min):
            min = diff
        si += 1
        ei += 1
    return min



L=eval(input().strip())
P=int(input())
print(find_Min_Difference(L,P))