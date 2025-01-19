n = int(input())
for i in range(n):
    try:
        n1, n2 = input().split(' ')
        ans = int(n1)//int(n2)
        print(ans)
    except ZeroDivisionError:
        print("Error Code: integer division or modulo by zero")
    except ValueError as v:
        print("Error Code:", v) 
        
