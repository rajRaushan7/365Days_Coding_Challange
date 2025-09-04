prices = [7, 1, 5, 3, 6, 4]

bp = prices[0]
profit = 0
for sp in prices[1:]:
    if sp-bp > profit:
        profit = sp-bp
    if sp-bp < 0:
        bp = sp

print(profit)

