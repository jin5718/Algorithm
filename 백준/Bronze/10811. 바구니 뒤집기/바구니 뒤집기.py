N, M = map(int,input().split())
basket = []

for l in range(1,N+1):
    basket.append(l)

for k in range(1, M+1):
    i, j = map(int, input().split())
    i -= 1
    j -= 1

    nlst = basket[i:j+1]
    result = nlst[::-1]

    basket[i:j+1] = result
print(*basket)