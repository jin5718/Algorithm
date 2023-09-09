T = int(input())

for j in range(T):
    br = input()
    stack = []
    for i in br:
        if i == '(':
            stack.append(i)
        elif stack and i == ')' and stack[-1] == '(':
            stack.pop()
        elif i == ')':
            stack.append(br)

    if stack:
        result = 'NO'
    else:
        result = 'YES'

    print(result)
