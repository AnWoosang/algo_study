import sys

n = list(sys.stdin.readline().rstrip())
res = []
for i in range(len(n)):
    n[i] = int(n[i])

n = n[::-1]

tmp = 0
for i in range(len(n)):

    tmp += n[i]*(2**(i%3))
    if (i % 3 == 2 and i != 0) or i == (len(n) - 1):
        res.append(str(tmp))
        tmp = 0

res = res[::-1]
print("".join(res))