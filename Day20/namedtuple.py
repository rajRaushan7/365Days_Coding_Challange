from collections import namedtuple

n = int(input())
column_name = input().split()
students = namedtuple('students', column_name)

total = 0
for i in range(n):
    c1, c2, c3, c4 = input().split()
    s = students(c1, c2, c3, c4)
    total += int(s.MARKS)

avg = total/n

print(avg)
