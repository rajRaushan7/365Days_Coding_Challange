from collections import OrderedDict

products = OrderedDict()
n = int(input())

for i in range(n):
    goods = input().split(' ')
    quantity = int(goods[-1])
    good = ' '.join(goods[:-1])
    if good not in products:
        products[good] = quantity
    else:
        products[good] += quantity

for char in products:
    print(char, products[char])
