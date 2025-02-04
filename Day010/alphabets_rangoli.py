def print_rangoli(size):
    # your code goes here
    alphabets = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    
    n = size
    width = (4*n) - 3
    
    def string_reverse(string):
        rev = ''
        for i in range(len(string)):
            rev = rev + string[-(i+1)]
        return rev
    
    def line(list, n, mid):
        middle = list[mid-1]
        last = ''
        for i in range(n):
            last = last + list[mid + i]
        initial = string_reverse(last)
    
        string = initial + middle + last
        final = ''
        for char in string: 
            final = final + char + '-'
        final = final[:-1]
    
        return final
    
    # Upper Triangle -----------------
    
    mid = n
    for i in range(n-1):
        alphas = line(alphabets, i, mid)
        print(alphas.center(width, '-'))
        mid -= 1
    
    # Middle Line --------------------
    
    print(line(alphabets, n-1, 1))
    
    # Lower Triangle ------------------
    
    mid += 1
    for i in range(n-1):
        alphas = line(alphabets, n - (i+2), mid)
        print(alphas.center(width, '-'))
        mid += 1

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
