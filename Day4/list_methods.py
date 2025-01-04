if __name__ == '__main__':
    N = int(input())
    list = []
    for i in range(N):
        inp = input().split(' ')
        command = inp[0]
        nums = inp[1:]
        if command == 'insert':
            index = int(nums[0])
            num = int(nums[1])
            list.insert(index, num)
        elif command == 'append':
            num = int(nums[0])
            list.append(num)
        elif command == 'print':
            print(list)
        elif command == 'remove':
            num = int(nums[0])
            list.remove(num)
        elif command == 'sort':
            list.sort()
        elif command == 'reverse':
            list.reverse()
        elif command == 'pop':
            list.pop()
