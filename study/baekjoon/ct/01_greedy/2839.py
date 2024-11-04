# 3x + 5y
n = int(input())
result = []

cnt = 0
while n >= 3:
    
    if n % 5 == 0:
        result.append(n//5)
        break
    
    if n % 3 == 0:
        result.append((n//3) + (cnt//5))
        if n == 3:
            break
    n -= 5
    cnt += 5
 
if result:
    print(min(result))
else:
    print(-1)