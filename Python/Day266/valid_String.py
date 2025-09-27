def isValid(s: str) -> bool:
    stack = []
    mapping = {')': '(', '}': '{', ']': '['}
    
    for char in s:
        if char in mapping.values():  # opening bracket
            stack.append(char)
        elif char in mapping:         # closing bracket
            if not stack or stack[-1] != mapping[char]:
                return False
            stack.pop()
        else:
            return False  # invalid char
    
    return not stack

# Example Usage
print(isValid("()[]{}"))   # True
print(isValid("(]"))       # False
print(isValid("([{}])"))   # True