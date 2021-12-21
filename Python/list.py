l=[1,8,9]
l2 = [2,23,10,44,8,9,0,12]
ans = list(l+l2)
ans.sort()
print(ans)
print(ans[int((len(ans)*.5))])

