import textwrap

def wrap(string, max_width):
    wrapped_line = textwrap.wrap(string, width= max_width)
    ans = '\n'.join(wrapped_line)
    return ans

if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
