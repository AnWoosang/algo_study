import sys

n = int(sys.stdin.readline().rstrip())
res = ""
done = True

if n == 0:
    done = False
    res ="0"

while done:
    if n % (-2) == -1 :
        res += "1"
        n = n//(-2) + 1
    
    elif n // (-2) == 0 and n % (-2) == 0:
        done = False
        
    else:      
        res += "0"
        n = n//(-2)

print(res[::-1])