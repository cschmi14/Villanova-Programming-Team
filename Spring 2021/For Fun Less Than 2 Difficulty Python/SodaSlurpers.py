def findSodas(b, c):
    total = b / c
    return total

str = input().split()
e = int(str[0])
f = int(str[1])
c = int(str[2])
b = f + e
count = 0

while findSodas(b, c) >= 1:
    curr = int(findSodas(b,c))
    count += curr
    b = curr + (b % c)

print(count)
