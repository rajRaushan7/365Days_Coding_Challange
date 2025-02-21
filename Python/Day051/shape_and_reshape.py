'''
Task: 
You are given a space separated list of nien integers. Your task is to convert this list into a 3X3 NumPy array.

Input Format:
A single line of input containing 9 space separated integers.

Output Format:
Pring the 3X3 NumPy array.
'''

import numpy

arr = list(map(int, input().split(' ')))
new_array = numpy.array(arr)
new_array.shape = (3,3)
print(new_array)