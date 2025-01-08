if __name__ == '__main__':
    s = input()
    isAlnum = False
    isAlpha = False
    isDigit = False
    isLower = False
    isUpper = False
    
    for char in s:
        if char.isalpha() :
            isAlpha = True
        if char.isdigit() :
            isDigit = True
        if char.islower() :
            isLower = True
        if char.isupper() :
            isUpper = True
    if (isAlpha or isDigit):
        isAlnum = True
        
    print(isAlnum)
    print(isAlpha)
    print(isDigit)
    print(isLower)
    print(isUpper)
