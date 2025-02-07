set1 = input().split(' ')
set2 = input().split(' ')

product = []

for c1 in set1:
    for c2 in set2:
        element = [int(c1), int(c2)]
        element = tuple(element)
        product.append(element)

for char in product:
    print(char, end = ' ')
