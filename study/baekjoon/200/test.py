stackary = []
tempary = []
num=1
no_message=True

number = int(input())

for i in range(0,number) :
    inputnum = int(input())
    while num<inputnum+1:
        stackary.append(num)
        num+=1
        tempary.append("+")
    
    if stackary[-1] == inputnum :
        stackary.pop()
        tempary.append('-')
    
    else :
        no_message=False



if no_message==False:
    print("NO")
else:
    for i in tempary:
            print(i)
