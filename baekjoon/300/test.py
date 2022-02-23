import sys

isprime = True
prime_nums = [2, 3, 5, 7]
res = []

se = sys.stdin.readline().split()
s, e = int(se[0]), int(se[1])

idx = -1
for i in prime_nums:
    if i >= s:
        idx = prime_nums.index(i)
        break
prime_nums = prime_nums[:idx]


for i in range(s, e+1):
    
    for j in prime_nums:
        if i % j == 0:
            isprime = False

    if i == 1:
        isprime = False

    elif int(i ** (1/2)) in res:
        isprime = False

    if isprime:
        if i <= 7:
            prime_nums.append(i)
        res.append(i)
    isprime = True

for i in res:
    print(i)