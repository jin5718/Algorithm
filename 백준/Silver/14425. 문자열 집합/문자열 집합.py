N, M = map(int, input().split())
S = set()
lst = []
cnt = 0
for i in range(N):
    word = input()
    S.add(word)

for j in range(M):
    word2 = input()
    lst.append(word2)

for k in lst:
    if k in S:
        cnt += 1

print(cnt)