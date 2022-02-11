num = int(input())
top = 0
stack = []
res = []

for i in range(num):
    tmp = int(input())

    while top < tmp:
        top += 1
        stack.append(top)
        res.append('+')
    
    if stack[-1] == tmp:
        stack.pop()
        res.append('-')

    else:
        break

if len(stack) == 0:
    for i in res:
        print(i)

else:
    print("NO")

