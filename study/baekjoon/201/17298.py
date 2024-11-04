# 스택에 value가 들어가지 않고 index를 삽입시키는 아이디어
import sys

n = int(sys.stdin.readline().rstrip())
A = list(map(int, sys.stdin.readline().split()))
answer = [-1] * n
stack = []

stack.append(0)
for i in range(1, n):
    while stack and A[stack[-1]] < A[i]:
        answer[stack.pop()] = A[i]
        print(stack)
        print(answer)
    stack.append(i)

print(*answer)

# 틀린 이유 : O(n^2) 그대로 구현
# for i in range(length):
#     tmp = seq[i+1:length]
#     tmp_num = len_res
    
#     if len(tmp) == 0:
#         res.append(-1)
    
#     else:
#         for j in tmp:

#             if seq[i] < j:
#                 res.append(j)
#                 len_res += 1
#                 break
            
#         if tmp_num == len_res:
#             res.append(-1)
#             len_res += 1