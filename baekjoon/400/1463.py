import sys

res = {}

def make_1(n):

    if n == 1:
        return 0
    elif n in res.keys():
        return res[n]
    else:
        if n % 6 == 0:
            res[n] = min(make_1(n//2), make_1(n//3)) + 1
        elif n % 2 == 0:
            res[n] = min(make_1(n//2), make_1(n-1)) + 1
        elif n % 3 == 0:
            res[n] = min(make_1(n//3), make_1(n - 1)) + 1
        else:
            res[n] = make_1(n-1) + 1
        return res[n]


num = int(sys.stdin.readline().rstrip())
print(make_1(num))