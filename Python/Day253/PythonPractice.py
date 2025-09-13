'''
return true if a number entered by a user is prime product or false otherwise
'''
''' Method 1 '''
m = int(input("Enter a number: "))
def factors(n):
    fL = []
    for i in range (2, (n//2)+1):
        if(n % i == 0):
            fL.append(i)
    return fL
def prime_product(m):
    if(m < 0):
        return False
    
    f = factors(m)

    if(len(f) == 2):
        return True
    elif(len(f) == 1):
        if(f[0] * f[0] == m):
            return True
    
    return False
''' Method 2 '''
def is_Prime(n):
    if (n < 2):
        return False
    for i in range (2, int((n**0.5)) + 1):
        if(n % i == 0):
            return False
    return True
def prime_Product(n):
    if n <= 3 :
        return False
    for i in range(2, int((n**0.5)) + 1):
        if(n % i == 0): 
            if is_Prime(i):
                if is_Prime(n//i):
                    return True
    return False

print(prime_product(m))
print(prime_Product(m))