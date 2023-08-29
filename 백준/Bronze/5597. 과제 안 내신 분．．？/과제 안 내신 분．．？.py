arr = []
lst = []
lst2 = []
for i in range(28):
    num = int(input())
    arr.append(num)

for j in range(1, 31):
    lst.append(j)


for k in lst:
    if k not in arr:
        lst2.append(k)
print(min(lst2))
print(max(lst2))