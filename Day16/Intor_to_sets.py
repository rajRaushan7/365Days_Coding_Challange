def average(array):
    # your code goes here
    size_set = set(array)
    size_set = list(size_set)
    
    dist_trees = 0
    dist_height = 0
    for char in size_set:
        dist_height += char
        dist_trees += 1
    return (dist_height/dist_trees)

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
