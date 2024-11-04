n = int(input())
res = 1

for i in range(n+1):
    if i==0:
        continue
    else:
        res *= i

print(res)