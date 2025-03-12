import numpy
numpy.set_printoptions(legacy='1.13')

r, c = input().strip().split(' ')
r = int(r)
c = int(c)

print(numpy.eye(r, c, k = 0))