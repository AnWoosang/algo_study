from collections import Counter

a = [1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3]
b = Counter(a)
print(b)

b[1] -= 1

print(b[1])