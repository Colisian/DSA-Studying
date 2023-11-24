def countdown(x):
    if x == 0:
        print("done")
        return
    else:
        print(x, "...")
        countdown(x-1) #function call
        print("Stack Check") #call stack will be unwound after the final return statement. Print statement will be called for each item in the call stack

countdown(5)


