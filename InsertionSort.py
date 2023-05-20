#InsertionSort Algorithams

#Declare an Array/ Creating array

A = []

#number of Elements as Input
n = 9

for i in range(0,n):

    Number = int(input("Enter a Number Here: "))
    if (Number>10 and Number<20):
        A.append(Number)
    else:
        print('Invalid Number')    
    
    # i = i + 1

#print(A)
# print(type(A))    


def INSERTIONSORT(A):

    for i in range(1,len(A)):
        key = A[i]
        j = i - 1
        while j >=0 and key < A[j]:
            A[j+1] = A[j]
            j = j - 1
        A[j+1] = key    
   
INSERTIONSORT(A)
print("Sorted Array: ",A)
   