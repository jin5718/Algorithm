lst = []

for i in range(10):
    N = int(input())
    lst.append(N % 42)
lst2 = set(lst)
print(len(lst2))