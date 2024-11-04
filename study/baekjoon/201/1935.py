import sys 

num = int(sys.stdin.readline().rstrip())
exp = list(sys.stdin.readline().rstrip())
stack = []
dic = {}

for i in range(len(exp)):
    tmp = exp[i]
    if tmp != "+" and tmp != "-" and tmp != "*" and tmp != "/":
        if exp[i] not in dic.keys():
            dic[exp[i]] = int(sys.stdin.readline().rstrip())

for i in exp:
    if not stack:
        stack.append(dic[i])
    else:
        if i == "+":
            tmp_a = stack.pop()
            tmp_b = stack.pop()
            stack.append(tmp_b + tmp_a)

        elif i == "-":
            tmp_a = stack.pop()
            tmp_b = stack.pop()
            stack.append(tmp_b - tmp_a)
            
        elif i == "*":
            tmp_a = stack.pop()
            tmp_b = stack.pop()
            stack.append(tmp_b * tmp_a)

        elif i == "/":
            tmp_a = stack.pop()
            tmp_b = stack.pop()
            stack.append(tmp_b / tmp_a)

        else:
            stack.append(dic[i])


print("%.2f" % stack.pop())