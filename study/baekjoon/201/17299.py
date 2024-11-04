from collections import Counter
import sys

n = int(sys.stdin.readline().rstrip())
A = list(map(int, sys.stdin.readline().split()))
answer = [-1] * n
stack = []
f = Counter(A)

stack.append(0)

for i in range(1, n):
    while stack and f[A[stack[-1]]] < f[A[i]]:
        answer[stack.pop()] = A[i]
    stack.append(i)
print(*answer)