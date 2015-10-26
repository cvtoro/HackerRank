
#Cecilia Villatoro

# Given a word w, rearrange the letters of w to construct another word s 
# in such a way that s is lexicographically greater than w. 
# In case of multiple possible answers, find the lexicographically smallest one among them.

#returns a list of all permutations of s
def permutation(s):
    if len(s) == 1:
        return [s]
    else:
        return merge(s[0] , permutation(s[1:]))
    
#returns a list    
def merge(s, list):
    l = []
    for p in list:
        for i in range(len(p)):
           if i == len(p)-1:
             l.append(p + s)
           l.append(p[:i] + s + p[i:])
    return l

def bigger(w):
    maxlist = []
    per = permutation(w) 
    #print (per)
    for p in per:
        if p > w:
            #print ("here" + p)
            maxlist.append(p)
    if len(maxlist) > 0:
        min = maxlist[0]
        for m in maxlist:
            if m < min:
                min = m
        return min
    else:
        return w
        
            
def testBigger(w):
    result = bigger(w)
    #print (result)
    if result == w:
        print ('no answer')
    else:
        print (result)
    
            
num = input()
num = int(num)
for i in range(num):
    s = input()
    testBigger(s)