import sys

def isprime(num):
    if num == 1:
        return False

    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

ip = sys.stdin
n = int(ip.readline().rstrip())

if n == 1:
    exit(0)

for i in range(2,n+1):
    status = isprime(i)
    if status: 

        while n % i == 0:
            print(i)
            n //= i
    
    if isprime(n):
        print(n)
        break

    elif n == 0 or n == 1:
        break
    
