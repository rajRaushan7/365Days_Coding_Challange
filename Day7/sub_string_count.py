def count_substring(string, sub_string):
    l = len(sub_string)
    count = 0
    end = len(string) - l + 1
    for i in range(end):
        char = string[i:(i+l)]
        if sub_string == char:
            count += 1
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
