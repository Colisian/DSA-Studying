
items = [6,20,8,19,56,23,87,41,49,53]

def mergeSort(dataset):
    if len(dataset) > 1: ##breaking condition until single elements
        mid = len(dataset) // 2 #finding the midpoint
        leftArr = dataset[:mid]
        rightArr = dataset[mid:]

        mergeSort(leftArr) # recursively breakdown the left arrays
        mergeSort(rightArr) # recursively breakdown the right  arrays


        i=0 #index into left array
        j=0 #index into right array
        k=0 #index into merged array

        while i < len(leftArr) and j < len(rightArr): # while each array has values
            if leftArr[i] < rightArr[j]:
                dataset[k] = leftArr[i]
                i += 1
            else:
                dataset[k] = rightArr[j]
                j+=1
            k += 1
        
        while i < len(leftArr): #if there are left over values in left array add them in
            dataset[k] = leftArr[i]
            i += 1
            k += 1

        while i < len(rightArr): #if there are left over values in left array add them in
            dataset[k] = rightArr[j]
            j += 1
            k += 1


print(items)
mergeSort(items)
print(items)
