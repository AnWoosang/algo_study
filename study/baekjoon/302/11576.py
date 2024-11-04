import sys

ip = sys.stdin
a, b = map(int, ip.readline().split())

digit = int(ip.readline().strip())
line = list(map(int, ip.readline().split()))
line = line[::-1]

n = 0

for i in range(digit):    
    n += a ** i * line[i]

res = []
while n:
    res.append(str(n%b))
    n //= b

print(" ".join(res[::-1]))