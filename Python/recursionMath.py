

def power(num, pwr):
    if pwr == 0:
        return 1
    else:
        return num * power(num, pwr-1) 

#power(2,3) = 2 * power(2,2)
#           = 2 *(2* power(2,1))
#           = 2 * (2* ( 2 * power(2,0)))
#           = 2 *(2* (2 * 1))
#
#
#
#
#


def factorial(num):
    if num == 0:
        return 1
    else: 
        return num * factorial(num - 1)

print("{} to the power of {} is {}".format(5,3,power(5,3)))
print("{} to the power of {} is {}".format(1,5,power(1,5)))
print("{}! is {}".format(4, factorial(4)))
print("{}! is {}".format(0, factorial(0)))
