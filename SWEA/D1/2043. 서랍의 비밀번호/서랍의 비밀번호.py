P, K = map(int,input().split())
cnt = 0
result = P - K

while True:
    cnt += 1
    if result == cnt:
        break
print(cnt+1)