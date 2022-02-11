import sys

command_num = int(sys.stdin.readline().rstrip())

deque = []
siz = len(deque)

for i in range(command_num):

    command = sys.stdin.readline().rstrip().split()

    if command[0] == 'push_front':
        deque.insert(0, command[1])
        siz += 1

    elif command[0] == 'push_back':
        deque.append(command[1])
        siz += 1

 
    elif command[0] == 'pop_front': 
        if siz == 0:
            print(-1)
        else:
            tmp = deque.pop(0)
            print(tmp)
            siz -= 1

    elif command[0] == 'pop_back':
        if siz == 0:
            print(-1)
        else:
            tmp = deque.pop()
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
            print(deque[0])

    elif command[0] == 'back':
        if siz == 0:
            print(-1)
        else:
            print(deque[siz-1])
