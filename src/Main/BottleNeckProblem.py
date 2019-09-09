radius = list(map(int, input("Enter space separated input : ").split(" ")))
ans = [radius.count(i) for i in h]
print(max(ans))
