n = int(input())

strings = []
str_dict = {}
for i in range(n):
    word = input()
    if word not in strings:
        strings.append(word)
        str_dict[word] = 1
    else:
        str_dict[word] += 1
        
print(len(strings))
for key in str_dict:
    print(str_dict[key], end = ' ')
    
