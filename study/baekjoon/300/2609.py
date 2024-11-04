import sys
import math

a, b = sys.stdin.readline().split()
a, b = int(a), int(b)

g = math.gcd(a, b)
l = a * b // g

print(g)
print(l)