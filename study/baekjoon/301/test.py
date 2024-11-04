import sys
import time

number = []


start_time = time.process_time()

# 실행 시간을 측정할 코드
number= list(sys.stdin.readline().rstrip())
result =0
iter=len(number)

for i in range(0,len(number)):
    if number[i] == '1':
        a,b=divmod((iter-1)-i,3)
        result += ((2**b)*(10**a))

print(result)
end_time = time.process_time()
print(f"time elapsed : {int(round((end_time - start_time) * 1000000))}mus")

start_time = time.process_time()

n = number
res = []
for i in range(len(n)):
    n[i] = int(n[i])

n = n[::-1]

tmp = 0
for i in range(len(n)):

    tmp += n[i]*(2**(i%3))
    if (i % 3 == 2 and i != 0) or i == (len(n) - 1):
        res.append(str(tmp))
        tmp = 0

res = res[::-1]
print("".join(res))

end_time = time.process_time()
print(f"time elapsed : {int(round((end_time - start_time) * 1000000))}mus")


start_time = time.process_time()

n = number
res = ''
for i in range(len(n)):
    n[i] = int(n[i])

n = n[::-1]

tmp = 0
for i in range(len(n)):

    tmp += n[i]*(2**(i%3))
    if (i % 3 == 2 and i != 0) or i == (len(n) - 1):
        res += str(tmp)
        tmp = 0

print(res[::-1])

end_time = time.process_time()
print(f"time elapsed : {int(round((end_time - start_time) * 1000000))}mus")