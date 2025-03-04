'''
Task

You are given a space separated list of numbers.
Your task is to print a reversed NumPy array with the element type float.

Input Format

A single line of input containing space separated numbers.

Output Format

Print the reverse NumPy array with type float.
'''

import numpy
def arrays(arr):
    # complete this function
    # use numpy.array
    rev = []
    for i in range(len(arr)):
        rev.append(arr[-(i+1)])
    revArr = numpy.array(rev, float)
    return revArr

arr = input().strip().split(' ')
result = arrays(arr)
print(result)