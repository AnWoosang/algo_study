import sys
import math

n, s = map(int, sys.stdin.readline().split())

bro = list(map(int, sys.stdin.readline().split()))

for i in range(len(bro)):
    bro[i] -= s

    if bro[i] <= 0:
        bro[i] *= -1

res = bro[0]

for i in range(1, len(bro)):
    res = math.gcd(res, bro[i])

print(res)