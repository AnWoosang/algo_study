import sys 

alpha_dic = {}
alpha = ['a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'
        ,'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

for i in alpha:
    alpha_dic[i] = -1

s = list(sys.stdin.readline().rstrip())

for i in range(len(s)):
    tmp = alpha_dic[s[i]]
    if tmp == -1:
        alpha_dic[s[i]] = i


print(*list(alpha_dic.values()))
