import sys

a, b, c = sys.stdin.readline().split()
a, b, c = int(a), int(b), int(c)

res1 = (a+b)%c
res2 = ((a%c) + (b%c))%c
res3 = (a*b)%c
res4 = ((a%c) * (b%c))%c

print(res1)
print(res2)
print(res3)
print(res4)