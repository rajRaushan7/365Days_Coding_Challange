def minion_game(string):
    # your code goes here
    c = 0
    v = 0
    for i in range(len(string)):
        if string[i] in 'AEIOU':
            v = v + len(string[i:])
        else:
            c = c + len(string[i:])

    if v > c:
        print('Kevin', v)
    elif v < c: 
        print('Stuart', c)
    elif v == c:
        print('Draw') 

if __name__ == '__main__':
    s = input()
    minion_game(s)
