from collections import Counter

no_of_shoes = int(input())
size_list = input().split(' ')
size_dict = dict(Counter(size_list))
no_of_customers = int(input())

money_earned = 0

for i in range(no_of_customers):
    size, amount = input().split(' ')
    if size in size_dict:
        if (size_dict[size] > 0):
            money_earned += int(amount)
            size_dict[size] -= 1

print(money_earned)
