import sys
N, M = map(int, sys.stdin.readline().split())
people = set()
people2 = set()
result = []

for i in range(N + M):
    name = sys.stdin.readline().strip()  # 개행 문자(\n)를 제거한 입력을 읽음
    if name in people:
        people2.add(name)
    else:
        people.add(name)

people2 = list(sorted(people2))
print(len(people2))
for k in people2:
    print(k)