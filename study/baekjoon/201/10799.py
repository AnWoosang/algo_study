import sys

line = []
stack = []
res = 0

s = list(sys.stdin.readline().rstrip())

for i in range(len(s)):
    

    if len(line) == 0:
        line.append(s[i])

    elif line[-1] == "(" and s[i] == ")":
        line.pop()
        line.append(1)
    
    else:
        line.append(s[i])
    print(i , " " , line)


for i in range(len(line)):

    if len(stack) == 0:
        stack.append(line[i])

    elif type(stack[-1]) == type(1) and type(line[i]) == type(1):
        tmp = stack.pop()
        tmp += line[i]
        stack.append(tmp)

    elif type(line[i]) == type(1):
        stack.append(line[i])

    elif line[i] == "(":
        stack.append(line[i])

    elif line[i] == ")":
        tmp = 0
        while type(stack[-1]) == type(1):
            tmp += stack.pop()
        stack.pop()
        res += (tmp+1)
        stack.append(tmp)

print(res) 
