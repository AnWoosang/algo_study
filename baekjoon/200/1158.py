import sys

line = sys.stdin.readline().rstrip().split()
n = int(line[0])
k = int(line[1])

l = list(range(1, n+1))
res = []
siz = len(l)
k_back = k - 1

for i in range(n):

    tmp = l.pop(k_back)
    siz -= 1
    res.append(tmp)
    k_back += k - 1

    if k_back >= siz and siz > 0:
        k_back = k_back % siz

print("<", ', '.join(str(i) for i in res), ">", sep = '')
a = "<" + ', '.join(str(i) for i in res) + ">"

print("<", end="")
b = "<"
for i in res:
    print(str(i), end=", ")
    b = b + str(i) + ", "
print("\b\b>")
b += "\b\b>"

print(a)
print(b)
print(a == b)

