'''
Task

You are given two arrays: A and B.
Your task is to compute their inner and outer product.

Input Format

The first line contains the space separated elements of array A.
The second line contains the space separated elements of array B.

Output Format

First, print the inner product.
Second, print the outer product.
'''

import numpy

arr1 = list(map(int, input().strip().split(' ')))
arr2 = list(map(int, input().strip().split(' ')))

A = numpy.array(arr1)
B = numpy.array(arr2)

print(numpy.inner(A, B))
print(numpy.outer(A, B))