def mutate_string(string, position, character):
    lst = []
    for char in string:
        lst.append(char)
    lst.pop(position)
    lst.insert(position, character)
    new_string = "".join(lst)
    return new_string

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
