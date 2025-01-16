n1 = int(input())
set1 = set(map(int, (input().split(' '))))
n2 = int(input())
set2 = set(map(int, (input().split(' '))))

union_set = set1.union(set2)
union_set = list(union_set)
union_set.sort()

for char in union_set:
    if ((char in set1) and (char not in set2)) or ((char not in set1 and char in set2)):
        print(char)
        
