S = input()
word = [-1] * 26
alpha = 'abcdefghijklmnopqrstuvwxyz'
for i in range(len(S)):
    for j in range(26):
        if alpha[j] == S[i] and word[j] == -1:
            word[j] = i
print(*word)