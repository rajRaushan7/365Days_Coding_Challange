import math
import cmath

z = input()

z = z.replace('j', '')
if z.count('-') == 2:
    x, y = z[1:].split('-')
    x = -int(x)
    y = -int(y)
elif z[1:].count('-') ==1:
    x, y = z.split('-')
    x = int(x)
    y = -int(y)
else:
    x, y = z.split('+')
    x = int(x)
    y = int(y)

r = math.sqrt((x*x) + (y*y))
phy = cmath.phase(complex(x, y))

print(r)
print(phy)
