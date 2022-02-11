import sys

s = list(sys.stdin.readline().rstrip())
stack = []
res = []

for i in range(len(s)):

    if len(stack) == 0:

        if s[i] == '<':
            res.append(s[i])
            stack.append(s[i])

        else:
            stack.append(s[i])

    else:
        if stack[-1] == "<":
            if s[i] == ">":
                stack.pop()
                res.append(s[i])

            else:
                res.append(s[i])

        elif s[i] == "<":
            while len(stack) != 0:
                tmp = stack.pop()
                res.append(tmp)

            stack.append(s[i])
            res.append(s[i])

        elif s[i] == " ":
            while len(stack) != 0:
                tmp = stack.pop()
                res.append(tmp)
            res.append(s[i])


        else:
            stack.append(s[i])

while len(stack) != 0:
    tmp = stack.pop()
    res.append(tmp)
    
print("".join(res))