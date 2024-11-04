import sys

n, b = map(int, sys.stdin.readline().split())

nota = ['0', '1', '2', '3', '4', '5', '6', '7', '8', 
        '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
res = ''

if n == 0:
    res = '0'

while n>0:
    res += nota[n % b]
    n //= b


print(res[::-1])