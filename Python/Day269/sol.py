def validPalindrome(s: str) -> bool:
    def isPalindrome(left, right):
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True
    
    left, right = 0, len(s) - 1
    while left < right:
        if s[left] != s[right]:
            
            return isPalindrome(left+1, right) or isPalindrome(left, right-1)
        left += 1
        right -= 1
    return True

print(validPalindrome("abca"))     
print(validPalindrome("racecar"))  
print(validPalindrome("abc"))     