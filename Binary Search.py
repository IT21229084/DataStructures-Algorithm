Arr = []
for i in range(4):
    Arr.append(int(input("Enter Values: ")))

print(Arr)
key = int(input("Enter the search value: "))

#Arr = Array
#Min = Start Index
#Max = End Index
#key = search value
def binarySearch(Arr,Min,Max,key):

    if Max>= Min:

        mid = (Max+Min)//2

        if Arr[mid] == key:
            return mid
        elif Arr[mid] > key:
            return binarySearch(Arr,Min,mid-1,key)
        else:
            return binarySearch(Arr,mid+1,Max,key)
        
    else:
        return -1   

   
result = binarySearch(Arr,0,len(Arr)-1,key)
if result != -1:
    print("Elements is present at Index",str(result))

else:
    print("Element is not present in array")    

