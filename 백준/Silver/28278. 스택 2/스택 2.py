N = int(input())
lst = []
stack = []

for i in range(N):
    num = input().split()
    lst.append(num)

for j in lst:
    if j[0] == '1':
        stack.append(j[1])

    elif j[0] == '2':
        if stack:
            print(stack.pop())
        else:
            print(-1)

    elif j[0] == '3':
        print(len(stack))

    elif j[0] == '4':
        if stack:
            print(0)
        else:
            print(1)

    elif j[0]=='5':
        if stack:
            print(stack[-1])
        else:
            print(-1)

