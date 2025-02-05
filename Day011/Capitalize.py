# Complete the solve function below.
def solve(s):
    lst = s.split(' ')
    ans = []
    for char in lst:
        char = char.capitalize()
        ans.append(char)
    name = ' '.join(ans)
    return name
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
