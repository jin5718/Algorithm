N = int(input())

waitarr = list(map(int, input().split()))

tmp = []

i = 1

flag = 1

while True:
    if not waitarr and not tmp:
        break
    if waitarr and waitarr[0] == i:
        waitarr.pop(0)
        i += 1  
    else:      
        tmp.append(waitarr[0])
        waitarr.pop(0)


    while tmp:
        if tmp[-1] == i:
            tmp.pop()
            i += 1
        else:
            break

    if not waitarr and tmp:
        flag = 0
        break

if flag == 1:
    print('Nice')
else:
    print('Sad')
