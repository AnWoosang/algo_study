import sys 

n = int(sys.stdin.readline().rstrip())
res = 1

if n != 0:
    for i in range(1, n + 1):
        res *= i

print(res)