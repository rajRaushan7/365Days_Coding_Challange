'''
Task: 
You are given a space separated list of integers. If all the integers are positive, then you need to check if any integer is a palindromic integer.

Input Format:
The first line contains an integer N. N is the total number of integers in the list.
The second line contains the space separatedlist of N integers.

Output Format:
Print True if all the condition of the problem statement are satisfied. Otherwise print False.
'''

n = int(input())
lst = input().split(' ')

ans = True
palendromCount = 0
for char in lst:
    if int(char) < 0:
        ans = False
        break
    else:
        if char == char[::-1]:
            palendromCount += 1
            
if(palendromCount > 0 and ans):
    print(True)
else:
    print(False)