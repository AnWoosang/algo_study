import sys

opt_stack = []
prior = {"+":2, "-":2, "*":1, "/":1, "(":0, ")":0}
expr = list(sys.stdin.readline().rstrip())
res = []

for i in expr:

    if i.isalpha():
        res.append(i)
        
    elif i == "+" or i == "-" or i == "*" or i == "/":
        if not opt_stack:
            opt_stack.append(i)
        else:
            if opt_stack[-1] == "(":
                opt_stack.append(i)
            
            elif prior[opt_stack[-1]] > prior[i]:
                opt_stack.append(i)
            elif prior[opt_stack[-1]] == prior[i]:
                res.append(opt_stack.pop())
                opt_stack.append(i)
                
            else:
                while opt_stack and prior[opt_stack[-1]] != 0:
                    res.append(opt_stack.pop())     
                opt_stack.append(i)
    
    elif i == "(":
        opt_stack.append(i)
        
    elif i == ")":
        while True:
            if opt_stack and opt_stack[-1] != "(":
                res.append(opt_stack.pop())
            elif opt_stack[-1] == "(":
                opt_stack.pop()
                break
        
        
while opt_stack:
    res.append(opt_stack.pop())
                
print("".join(res))
        
