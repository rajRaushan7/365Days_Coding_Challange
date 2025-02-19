'''
You have to  generate a list of the first N fibonacci numbers, 0 being the first number. Then, apply the map function and a lambda expression to cube each febonacci number and print the list.

Input Format:
One line of input: an integer N.

Output Format:
A list on a single line containing the cubes of the first N fibonacci numbers.
'''

cube = lambda x: (x)**3

def fibonacci(n):
    # return a list of fibonacci numbers
    fibo = [0,1]
    if n == 0:
        return []
    elif n == 1:
        return [0]
    for i in range(n-2):
        n = fibo[i] + fibo[i+1]
        fibo.append(n)
    return fibo
        

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))