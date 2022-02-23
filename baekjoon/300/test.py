import sys

isprime = True

nums = list(map(int, sys.stdin.readline().split()))
s = nums[0]
e = nums[1] + 1

for i in range(s, e):
    if i == 1:
        continue

    elif i == 2:
        print(i)
        continue

    else:
        for j in range(2, int(i**(0.5))+1):
            if i % j == 0:
                isprime = False
                break

    if isprime:
        print(i)

    isprime = True
