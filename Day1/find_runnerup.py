n = int(input())
arr = map(int, input().split())
arr = list(arr)

arr.sort()
print(arr)

arr = set(arr)
lst = []
for char in arr:
    lst.append(char)
lst.sort()
print(lst)

if len(lst) == 1:
    print(lst[0])
else:
    runnerUp = lst[-2]
    print(runnerUp)