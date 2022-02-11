import sys

command_num = int(sys.stdin.readline().rstrip())

que = []
siz = len(que)

for i in range(command_num):

    command = sys.stdin.readline().rstrip().split()

    if command[0] == 'push':
        que.append(command[1])
        siz += 1

    elif command[0] == 'pop':
        if siz == 0:
            print(-1)
        else:
            tmp = que.pop(0)
            print(tmp)
            siz -= 1

    elif command[0] == 'size':
        print(siz)

    elif command[0] == 'empty':
        if siz == 0:
            print(1)
        else:
            print(0)

    elif command[0] == 'front':
        if siz == 0:
            print(-1)
        else:
            print(que[0])

    elif command[0] == 'back':
        if siz == 0:
            print(-1)
        else:
            print(que[siz-1])
