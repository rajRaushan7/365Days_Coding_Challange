import math
import os
import random
import re
import sys

if __name__ == '__main__':
    s = input()
    d = {}
    for char in s:
        if char not in d:
            d[char] = 1
        else:
            d[char] += 1
    sorted_d = dict(sorted(d.items(), key = lambda item: (-item[1], item[0])))
    count = 0
    for key in sorted_d:
        print(f"{key} {sorted_d[key]}")
        count += 1
        if count == 3:
            break
