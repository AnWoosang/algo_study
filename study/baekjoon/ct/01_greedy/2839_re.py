# 3x + 5y
n = int(input())
result = 0

while n > 0:
    
    if n % 5 == 0:
        result += n // 5
        n = 0
    else:
        n -= 3
        result += 1
        
if n == 0:
    print(result)
else:
    print(-1)