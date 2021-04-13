import math
def minimumFences(a):
    circ = ((a / math.pi) ** (1/2)) * (2 * math.pi)
    return (circ)
str = input().split()
a = float(str[0])
n = float(str[1])
x = 100
if (minimumFences(a) <= n):
    print("Diablo is happy!")
else:
    print("Need more materials!")
