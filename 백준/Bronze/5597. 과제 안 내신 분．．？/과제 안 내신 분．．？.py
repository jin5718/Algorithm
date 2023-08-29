lst = []

for j in range(1, 31):
    lst.append(j)

for i in range(28):
    num = int(input())
    lst.remove(num)

print(min(lst))
print(max(lst))