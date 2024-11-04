import sys

s = sys.stdin.readline().rstrip()
res = []

for i in range(len(s)):
    res.append(s[i:])
res.sort()
print(*res)