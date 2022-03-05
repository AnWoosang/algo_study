import sys

primes = [False] * 1000000

isprime = True
for i in range(2, 1000000):

    for j in range(2, int(i**0.5) + 1):
        if i % j == 0:
            isprime = False
            break
    if isprime:
        primes[i - 1] = True
    else:
        isprime = True
    
n = int(sys.stdin.readline().rstrip())

for i in range(n):
    ip_num = int(sys.stdin.readline().rstrip())
    res = 0

    if ip_num == 4:
        print(1)
    else:
        
        for i in range(3, ip_num//2 + 1):
            
            if primes[i-1] and primes[ip_num - i - 1]:
                res+=1
        print(res)