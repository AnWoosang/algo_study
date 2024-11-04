import sys

n = int(sys.stdin.readline().rstrip())
res = 0
isprime = True

nums = list(map(int, sys.stdin.readline().split()))

for i in nums:
    if i == 1:
        continue

    elif i == 2:
        res += 1
        continue

    for j in range(2,i):
        if i % j == 0:
            isprime = False
            break

    if isprime:
        res+=1

    isprime = True

print(res)