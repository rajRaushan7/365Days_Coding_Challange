def compressString(s: str) -> str:
    if not s:
        return s
    
    result = []
    count = 1
    
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            count += 1
        else:
            result.append(s[i-1] + str(count))
            count = 1
    
    # append last group
    result.append(s[-1] + str(count))
    
    compressed = "".join(result)
    
    return compressed if len(compressed) < len(s) else s

# Example Usage
print(compressString("aaabbccccd"))  # Output: a3b2c4d1
print(compressString("abcd"))        # Output: abcd