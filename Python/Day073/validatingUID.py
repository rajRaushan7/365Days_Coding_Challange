import re

n = int(input())
for _ in range(n):
    uid = input()
    isValid = False
    if(len(re.findall(r'[A-Z]', uid)) >= 2):
        if(len(re.findall(r'\d', uid)) >= 3):
            if(bool(re.search(r'[A-Za-z0-9]', uid))):
                if(len(uid) == len(set(uid))):
                    if(len(uid) == 10):
                        isValid = True
                        
    if(isValid):
        print("Valid")
    else:
        print("Invalid")