import sys

def cnt_divisor(n, k):
    div = 0
    while n:
        n //= k
        div += n
    return div

l, s = map(int,(sys.stdin.readline().split()))
div_2 = cnt_divisor(l, 2) - cnt_divisor(s, 2) - cnt_divisor(l-s,2)
div_5 = cnt_divisor(l, 5) - cnt_divisor(s, 5) - cnt_divisor(l-s,5)

if div_2 >= div_5:
    print(div_5)

else:
    print(div_2)

# l, s = map(int,(sys.stdin.readline().split()))
# if l//2 < s:
#     s = l - s

# nume = 0
# deno = 0

# n_2 = 0
# n_5 = 0

# d_2 = 0
# d_5 = 0

# li = range(1, l+1)

# for i in range(1,s+1):
#     tmp1 = li[-1*i]
#     tmp2 = li[i-1]

#     while True:
#         if tmp1 % 10 == 0:
#             n_2 += 1
#             n_5 += 1
#             tmp1 = tmp1/10

#         elif tmp1 % 5 == 0:
#             n_5 += 1
#             tmp1 = tmp1/5

#         elif tmp1 % 2 == 0:
#             n_2 += 1
#             tmp1 = tmp1/2
        
#         else:
#             break

#     while True:
#         if tmp2 % 10 == 0:
#             d_2 += 1
#             d_5 += 1
#             tmp2 = tmp2/10

#         elif tmp2 % 5 == 0:
#             d_5 += 1
#             tmp2 = tmp2/5

#         elif tmp2 % 2 == 0:
#             d_2 += 1
#             tmp2 = tmp2/2

#         else:
#             break

# if (n_2 - d_2) > (n_5 - d_5):
#     res = n_5 - d_5
# else:
#     res = n_2 - d_2
# print(res)