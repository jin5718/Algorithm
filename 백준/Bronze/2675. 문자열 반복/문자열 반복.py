T = int(input())

for i in range(T):
    lst = []
    N, txt = input().split()
    for j in range(len(txt)):
        lst.append(txt[j] * int(N))
    print(*lst,sep="")
