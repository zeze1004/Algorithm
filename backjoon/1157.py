val = list(input().upper())
print(val)
_set = set(val)
print(_set)
result = list(_set)
print(result)
cnt = 0
same_num = 0
for i in result:
    if cnt == val.count(i):
        same_num += 1
        print(i, cnt, same_num)
        # print(same_num)
    elif cnt < val.count(i):
        cnt = val.count(i)
        txt = i
        print(i, cnt, same_num)
        # print(same_num)
if same_num == 0:
    print(txt)
elif:
    print("?")
