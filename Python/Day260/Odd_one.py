'''
Write a function named odd_one (L) that accepts a list L as argument. Except for one element, all other elements in L are of the same data type. The function odd_one should return the data
type of this odd element. For example, if L is equal to [1, 2, 3.4, 5, 10], then the function should return the string
float. This is because the element 3.4 is the odd one here, all other elements are integers.
'''

def odd_one(L):
    for i in range(1, len(L)):
        curr = type(L[i]).__name__
        prev = type(L[i-1]).__name__
        if(i == 1 and curr != prev):
            if(curr != type(L[i+1]).__name__):
                return curr
            else:
                return prev 
        if(curr != prev):
            return curr
    return none

print(odd_one(eval(input().strip())))