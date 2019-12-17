
#Insertion Sort/ Merge Sort Algos

#Insertion Sort

Andy=[5,2,4,6,1,3]

def list_algo(A):
    for j in range(1,len(A)):
        key=A[j]
        i=j-1
        #as long key is less than i, and i has not reached end of list, we will swap elements 
        while i>=0 and A[i]>key:
            #save 5
            temp=A[i]
            #saying indexA[0](ex. 5) now equals int at index A[1](ex. 2)
            A[i]=A[i+1]
            #now A[1]=5
            A[i+1]=temp
            i-=1
    return A 

print(list_algo(Andy))           

#merge sort
#MERGE SORT: concept, used for big sorting lists. for smaller sorts,
#other sorts like insertion sort better 
#Merg Sort divides and conquers: divides into halves until individuals
#like DFS, finds all children, then sorts into 8,4,2, 1 pair
#time complexity is O(n * log(n))


#create random list of length 'size'
	#each element selected from 0-50 or 'max'
def create_array(size=10,max=50):
    from random import randint
    return [randint(0,max) for _ in range(size)]

print(create_array()) 


#when implementing MS, we break algo into 2 funcs
#first is merge sort function, second(merge)used to sort back arrays
#in this case, we will not have merge as nested function, but will 
#have these 2 seperated


#will keep looking at smallest end of a & b then keep taking off small
#until one element is empty
def merge(a,b):
    c=[]#final output array
    #a_idx and b_idx are index counters
    a_idx,b_idx=0,0 #smallest end of both lists are at beginning
    while a_idx<len(a) and b_idx<len(b):#cont iterating until all elements used in one of the arrays
        #comparing 2 arrays and appending whichever one is smaller
        #while also incrementing (indx +1 so we don't find same element again)
        if a[a_idx]<b[b_idx]:
            c.append(a[a_idx])
            a_idx+=1
        else:
            c.append(b[b_idx])
            b_idx+=1
    #after while,extend merge list with whichever of 2 lists not used up inside while loop      
    #if a_idx==len(a), we know we pushed all elements of a into c, so we push remaining b elements inside c
    #else, we know b_idx==len(b) and extend c with a[a_idx:end]
    if a_idx==len(a): 
        c.extend(b[b_idx:])
    else:             
        c.extend(a[a_idx:])
    return c

def merge_sort(a):
    #a list of zero or one already sorted
    if len(a)<=1: 
        return a
    lgth=int(len(a)/2) #for python 3, must declare int
    #split list in half and call merge sort recursively(forloop/russian doll solution) on each half
    left,right=merge_sort(a[:lgth]),merge_sort(a[lgth:])
    
    #merge the now-sorted sublists
    return merge(left,right)

a=create_array()
print (a)
s=merge_sort(a)
print (s)


