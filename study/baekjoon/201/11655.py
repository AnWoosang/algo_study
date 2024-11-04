import sys

s = list(sys.stdin.readline().rstrip())

low = ['a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'
        ,'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

upp = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'
        , 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']

for i in range(len(s)):
    tmp = s[i]
    if s[i].isalpha():
        if s[i].islower():
            idx = (low.index(s[i]) + 13) % 26
            s[i] = low[idx]
        else:
            idx = (upp.index(s[i]) + 13) % 26
            s[i] = upp[idx]

print("".join(s))