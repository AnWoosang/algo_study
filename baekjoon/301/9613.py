import sys
import math

t = int(sys.stdin.readline().rstrip())

while t:
    res = 0
    line = list(map(int, sys.stdin.readline().split()))
    for i in range(1, len(line)):
        for j in line[i+1:]:
           res += math.gcd(line[i], j)
    print(res)

    t -= 1