'''
Task:
You are given a string N.
Your task is to verify that N is a floating point number.
In this task, a valid float number must satisfy all of the follwoing requirements:
> Number can start wiht +, -, or . symbol.
> Number must cnatain at least 1 decimal value.
> Number must have exactly one . symbol.
> Number must not give any exceptions when converted using float(N).

Input Format:
The first line contains an integer T, the number of test cases.
The nuxt T line(s) contains a string N.

Output Format:
Output True of False each test case.
'''

N = int(input())

for i in range(N):
    n = input()
    try:
        if '.' not in n:
            print('False')
        elif (float(n)):
            print('True')
    except Exception:
        print('False')