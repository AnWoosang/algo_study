line_count = int(input())

for i in range(line_count):
    line = input().split()
    for j in line:
        print(j[::-1], end=" ")
    print()