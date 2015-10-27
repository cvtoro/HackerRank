#Cecilia Villatoro
#hackerrank anagram 

def anagram(s1, s2):
    #keep track of how many different characters s1 and s2 have
    countDiff = 0
    for i in s1:
        if i not in s2:
            countDiff += 1
        else:
            # i is in s2, delete that letter in s2
            rindex = s2.index(i)
           
            s2 = s2[:rindex]+ s2[rindex+1:]
           
    return countDiff

for i in range(int(input())):
    s = input()
    if len(s) % 2 != 0:
          print ('-1')
    else:
          index = int(len(s)/2)   
          
          print (anagram(s[:index], s[index:]))
    

          
       
            