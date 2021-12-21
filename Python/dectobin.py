def dectobin(x):
    b = ""
    while x>0:
       b=b+str(x%2)
       x=x//2
    return b[::-1]
        

num = int(input())

y=dectobin(num)

print(y)