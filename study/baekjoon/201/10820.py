import sys


while 1:
    s = list(sys.stdin.readline().rstrip("\n"))
    res = [0,0,0,0] # 소문자, 대문자, 숫자, 공백

    if not s:
        break

    for j in range(len(s)):
        tmp = s[j]

        if tmp.isalpha():
            if tmp.isupper():
                res[1] += 1
            else:
                res[0] += 1
        
        elif tmp.isdigit():
            res[2] += 1

        elif tmp == " ":
            res[3] += 1

    print(*res)