'''
Task:
You are given a stirng S.
S contains alphanumeric characters only.
Your task is to sort the string S in the following manner:
    • All sorted lowercase letteres are ahead of uppercase letters.
    • All sorted uppercase letters are ahead of digits.
    • All sorted odd digits are ahead of sorted even digits.
Input Format:
A single line of input contains the string S.

Output Format:
Output the sorted string S.
'''

string = input()
lower_lst = []
upper_lst = []
odd_lst = []
even_lst = []

for char in string:
    if char in '0123456789':
        if int(char) % 2 == 0:
            even_lst.append(char)
        else: 
            odd_lst.append(char)
    else:
        if char.upper() == char :
            upper_lst.append(char)
        elif char.lower() == char:
            lower_lst.append(char)

lower_lst.sort()
upper_lst.sort()
odd_lst.sort()
even_lst.sort()

lo = ''.join(lower_lst)
up = ''.join(upper_lst)
od = ''.join(odd_lst)
ev = ''.join(even_lst)

ans = lo + up + od + ev
print(ans)