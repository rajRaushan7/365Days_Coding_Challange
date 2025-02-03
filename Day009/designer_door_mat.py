line, width = (input()).split(' ')
line, width = int(line), int(width)

c = '.|.'
n = line//2
repeat = 1

# TOP
for i in range(n):
    char = c * repeat
    print(char.center(width, '-'))
    repeat += 2

# MIDDLE
print("WELCOME".center(width, '-'))

# BOTTOM
repeat -= 2
for i in range(n):
    char = c * repeat
    print(char.center(width, '-'))
    repeat -= 2
