def bubbleSort(dataset):
    # Start with the array length and decrement each time
    for i in range(len(dataset) - 1,0,-1): #minus 1 because that is the zero index array's last item, zero means stopping at first index, -1 to step by one each time
        for j in range(i): # to compare neighboring elements
            if dataset[j] > dataset[j+1]:
                temp = dataset[j] # temp to store value at j index
                dataset[j] = dataset[j + 1] # value at [j] becomes the previous value at [j+1]
                dataset[j+1] = temp #value at [j+1] becomes what was at [j]

        print("Current state: ", dataset)


def main():
    list1 = [6,20,8,19,56,23,87,41,49,53]
    bubbleSort(list1)
    print("Result: ", list1)

if __name__=="__main__":
    main()