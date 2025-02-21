def merge_the_tools(string, k):
    # your code goes here
    str_lst = []
    l = len(string)
    for i in range(k):
        str_lst.append(string[i:l:k])
        
    sub_str = []
    for i in range(l//k):
        ans = str_lst[0][i]
        for j in range(len(str_lst)):
            char = str_lst[j][i]
            if char not in  ans: 
                ans = ans + char
        sub_str.append(ans)
    
    for char in sub_str:
        print(char)
    
if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
