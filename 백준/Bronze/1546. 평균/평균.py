N = int(input())
arr = list(map(int,input().split()))
M = max(arr)
newscore = []
for i in range(N):
    result = (arr[i] / M*100)
    newscore.append(result)
print(sum(newscore)/N)