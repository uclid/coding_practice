'''
Q: Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
'''
def solution(inputArray):
    
    max_product = -sys.maxsize - 1
    
    for i in range(0, len(inputArray)-1):
        product = inputArray[i]*inputArray[i+1]
        if product > max_product:
            max_product = product
    
    return max_product
