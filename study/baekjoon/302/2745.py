import sys

nota = ['0', '1', '2', '3', '4', '5', '6', '7', '8', 
        '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 
        'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
        'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

n, notation = sys.stdin.readline().split()
n = n[::-1]
notation = int(notation)
res = 0

for i in range(len(n)):
    res += (notation ** i * int(nota.index(n[i])))

print(res)

