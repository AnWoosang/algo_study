import sys
import math

n = int(sys.stdin.readline().rstrip())

for i in range(n):
    a, b = sys.stdin.readline().split()
    a, b = int(a), int(b)

    print(a*b//math.gcd(a, b))