N = int(input())
people = set()
result = []

for i in range(N):
    name, status = input().strip().split()
    if status == 'enter':
        people.add(name)
    elif status=='leave' and name in people: # set leave - enter 출력 x
        people.remove(name)


result = list(people)
result.sort(reverse=True)

for k in result:
    print(k)