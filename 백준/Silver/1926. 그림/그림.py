di = [0, -1, 0, 1]
dj = [-1, 0, 1, 0]

import sys
input = sys.stdin.readline

N, M = map(int, input().split())
map = [list(map(int, input().split())) for _ in range(N)]
chk = [[False] * M for _ in range(N)]

def bfs(y, x):
    rs = 1
    q = [(y,x)]
    while q:
        ey, ex = q.pop()
        for k in range(4):
            ni, nj = ey + di[k], ex + dj[k]
            if 0<=ni<N and 0<=nj<M:
                if map[ni][nj] == 1 and chk[ni][nj] == False:
                    rs += 1
                    chk[ni][nj] = True
                    q.append((ni,nj))
    return rs    

cnt = 0
mx = 0
for i in range(N):
    for j in range(M):
        if map[i][j] == 1 and chk[i][j] == False:
            chk[i][j] = True
            cnt += 1
            mx = max(mx, bfs(i,j))
print(cnt)
print(mx)   