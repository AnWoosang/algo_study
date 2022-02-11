stack = []

num = int(input())

for i in range(num):
    tmp = input()
    stack.append(tmp[0])
    
    for j in range(1, len(tmp)):
        if len(stack) == 0:
            stack.append(tmp[j])

        else :
            if stack[-1] == '(' and tmp[j] == ')' :
                stack.pop()        
            else:
                stack.append(tmp[j])

    if len(stack) == 0:
        print("YES")
    else:
        print("NO")
    stack = []
