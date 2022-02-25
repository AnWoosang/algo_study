import sys

n = int(sys.stdin.readline().rstrip())
res = 1

if n != 0:
    for i in range(1, n+1):
        res *= i

res = list(str(res))
res = res[::-1]
zero = 0
end = False

for i in res:
    if i == '0':
        zero += 1

    else:
        break

print(zero) 