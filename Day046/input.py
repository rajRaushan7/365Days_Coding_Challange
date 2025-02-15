v, k = input().split(' ')
k = int(k)
poly = input()
val = poly.replace('x', v)

if eval(val) == k:
    print('True')
else:
    print('False')
