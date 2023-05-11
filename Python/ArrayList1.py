#You are given an array of integers, and you need to find the two numbers that add up to a given target value. 
#Write a function that takes in an array of integers and a target value, 
#and returns the indices of the two numbers that add up to the target value. If no such pair exists, return null.
#
#
#
#
#
#
def two_sum(list, k):
    for i in range(len(list)):
        for j in range(len(list)):
            if i != j and list[i] + list[j] == k:
                return [i, j]
    return None
