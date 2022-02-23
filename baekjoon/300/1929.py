import sys

isprime = True

nums = list(map(int, sys.stdin.readline().split()))
start = nums[0]
end = nums[1] + 1

for i in range(start, end):
    if i == 1:
        continue

    elif i == 2:
        print(i)
        continue

    elif i % 2 == 0 and i != 2:
        continue

    elif i % 3 == 0 and i != 3:
        continue

    elif i % 5 == 0 and i != 5:
        continue

    elif i % 7 == 0 and i != 7:
        continue

    else:
        for j in range(2,i):
            if i % j == 0:
                isprime = False
                break

    if isprime:
        print(i)

    isprime = True
