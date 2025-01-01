if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = list(arr)

    arr.sort()

    arr = set(arr)
    lst = []
    for char in arr:
        lst.append(char)
    lst.sort()

    if len(lst) == 1:
        print(lst[0])
    else:
       runnerUp = lst[-2]
       print(runnerUp)
