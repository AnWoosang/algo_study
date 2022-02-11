import sys
import time 

s = sys.stdin.readline().rstrip()
s_to_list = [list(s), []]

command_num = int(sys.stdin.readline().rstrip())

len_for = len(s_to_list[0])
len_back = len(s_to_list[1])

for i in range(command_num):
    command = sys.stdin.readline().rstrip().split()
    
    if command[0] == 'B':
        if len_for > 0:
            tmp = s_to_list[0].pop()
            len_for -= 1
            
    elif command[0] == 'L':
        if len_for > 0:
            tmp = s_to_list[0].pop()
            s_to_list[1].append(tmp)
            len_for -= 1
            len_back += 1

    elif command[0] == 'D':
        if len_back > 0:
            tmp = s_to_list[1].pop()
            s_to_list[0].append(tmp)
            len_for += 1
            len_back -= 1

    elif command[0] == 'P':
        s_to_list[0].append(command[1])
        len_for += 1


l = len(s_to_list[1])

for i in range(l):
    tmp = s_to_list[1].pop()
    s_to_list[0].append(tmp)

s_to_list = s_to_list[0]
s = "".join(s_to_list)
print(s)