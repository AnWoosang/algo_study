import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
result = [-1 for _ in range(n)]
stack = []

for i in range(n):
    try:
        while arr[stack[-1]] < arr[i]:
            result[stack.pop()] = arr[i]
    
    except:
        pass
    
    stack.append(i)

for i in range(n):
    print(result[i], end=" ")