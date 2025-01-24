from itertools import combinations

string, n = input().split(' ')
st = []
for s in string:
    st.append(s)
st.sort()
string = "".join(st)

n = int(n)
combinatn = []
for i in range(n):
    lst = list(combinations(string, i+1)) 
    for char in lst:
        combinatn.append(''.join(char))

for char in combinatn:
    print(char)
