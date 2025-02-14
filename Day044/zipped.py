sub, n  = input().split(' ')
sub = int(sub)
n = int(n)

allStudentsMarks = [] 
for i in range(n):
    marks = input().split(' ')
    allStudentsMarks.append(marks)
    
for i in range(sub):
    s = 0
    for j in range(n):
        s += float(allStudentsMarks[j][i])
    ans = s / n
    print("{:.1f}".format(ans))
