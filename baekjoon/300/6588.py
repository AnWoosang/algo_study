import sys

def is_prime(num):
    if num == 1:
        return False

    elif num == 2:
        return True

    elif num % 2 == 0:
        return False

    elif num % 3 == 0 and num != 3:
        return False

    elif num % 5 == 0 and num != 5:
        return False

    elif num % 7 == 0 and num != 7:
        return False

    else:
        for j in range(2, int(num**(0.5))+1):
            if num % j == 0:
                return False

    return True

while True:
    ip_num = int(sys.stdin.readline().rstrip())

    if ip_num == 0:
        break

    for i in range(3, ip_num):
        if is_prime(i) and is_prime(ip_num - i):
            print(ip_num, "=", i, "+", ip_num-i)
            break