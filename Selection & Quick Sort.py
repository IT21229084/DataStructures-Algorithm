#Selection sort

A = []
for v in range(4):
    A.append(int(input("Enter Values: ")))

print(A)

def selectionSort(A):
    n = len(A)
    for j in range(0,n-1):
        smallest = j
        for i in range(j+1,n):
            if A[i] < A[smallest]:
                smallest = i
        A[j],A[smallest] = A[smallest],A[j]        

selectionSort(A)
print("Sorted Array: ",A)     



#QuickSort

Arr = []
for i in range(5):
    Arr.append(int(input("Enter values :")))
    print(Arr)

def partition(Arr,low,high):
    i = (low-1)
    pivot = Arr[high]
    for j in range(low,high):
        if Arr[j] <= pivot:
            i = i + 1
            Arr[i],Arr[j] = Arr[j],Arr[i]

    Arr[i+1],Arr[high] = Arr[high],Arr[i+1]
    return (i+1)        

def QuickSort(Arr,low,high):

    if low < high:
        q = partition(Arr,low,high)
        QuickSort(Arr,low,q-1)
        QuickSort(Arr,q+1,high)


QuickSort(Arr,0,len(Arr)-1)
print("Sorted Array: ")

# for i in range(len(Arr)):
print(Arr)
print(max(Arr))



