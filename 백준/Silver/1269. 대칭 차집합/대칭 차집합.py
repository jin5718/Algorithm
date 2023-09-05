import sys

A, B = map(int, sys.stdin.readline().split())
Aset = set(map(int, sys.stdin.readline().split()))
Bset = set(map(int, sys.stdin.readline().split()))

result = (Aset - Bset) | (Bset - Aset)
print(len(result))