# Python program for implementation of MergeSort
def mergeSort(arr):
    if len(arr) > 1:
 
         # Finding the mid of the array
        mid = len(arr)//2
 
        # Dividing the array elements
        L = arr[:mid]
 
        # into 2 halves
        R = arr[mid:]
 
        # Sorting the first half
        mergeSort(L)
 
        # Sorting the second half
        mergeSort(R)
 
        i = j = k = 0
 
        # Copy data to temp arrays L[] and R[]
        while i < len(L) and j < len(R):
            if L[i] < R[j]:
                arr[k] = L[i]
                i += 1
            else:
                arr[k] = R[j]
                j += 1
            k += 1
 
        # Checking if any element was left
        while i < len(L):
            arr[k] = L[i]
            i += 1
            k += 1
 
        while j < len(R):
            arr[k] = R[j]
            j += 1
            k += 1
 

def turtle(turtle_Position,hole_Position):
    mergeSort(turtle_Position) #invoking the merge method to sort the list of turtle position.
    mergeSort(hole_Position)   #invoking the merge method to sort the list of hole position.
    
    time = (turtle_Position[0] - hole_Position[0])  #To calculate the time between the first turtle position and hole position.
    if time < 0: #if the time is less than 0 than minimum time will be  multiplied by the actually time * -1.
        minimumTime = time * -1
    else: # else, if time is greater than 0 than minimum time is equal to time. 
            minimumTime = time
    for i in range(1, len(turtle_Position)): # for loop is used to iterate over the length of list turtle position
        time = turtle_Position[i] - hole_Position[i] #To calculate the time between  turtle position and hole position.
        if time < 0: #if the time is less than 0 than time will be multiplied by -1.
            time = time * -1 
            if minimumTime < time: # to check if minimum time is lesser than time, if not assigns minimum time to time.
                minimumTime = time
        else:
            if minimumTime < time: # to check if minimum time is lesser than time, if not assigns minimum time to time.
                minimumTime = time
    print("positions of turtles are: ", turle_Position, "\npositions of holes are: ", hole_Position, "\n-> Time taken is ", minimumTime)

#example 1
turle_Position=[4,-4,2]
hole_Position=[4,0,5]
turtle(turle_Position,hole_Position)

#example 2
print()
turle_Position=[-10, -79, -79, 67, 93, -85, -28, -94]
hole_Position=[-2, 9, 69, 25, -31, 23, 50, 78 ]
turtle(turle_Position,hole_Position)

#example 3
print()
turle_Position=[-10, -79, -85, -28, -94, 12]
hole_Position=[-2, 9, -10, 50, 78, 90 ]
turtle(turle_Position,hole_Position)

