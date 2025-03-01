'''
Task:
A valid mobile number is a ten digit number starting with a 7, 8 or 9. Your task is to print whether a number entered by user is a valid mobile number or not

Input Format:
The first line contains an integer N, the number of inputs.
N line follow, each containing some string.

Output Format:
For every string listed, print "YES" if it is a valid mobile number and "NO" if it is not on separate lines. Do not pring the quotes.
'''

n = int(input())
for i in range(n):
    mob = input()
    isMob = 'YES';
    if(len(mob) != 10):
        isMob = 'NO'
    if(mob[0] not in ['7', '8', '9']):
        isMob = 'NO'
    for char in mob[1:]:
        if (char not in ['0', '1', '2', '3', '4', '5', '6', '7', '8','9']):
            isMob = 'NO'
    print(isMob)