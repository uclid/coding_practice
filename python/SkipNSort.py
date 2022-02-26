'''
Q: Some people are standing in a row in a park. There are trees between 
them which cannot be moved. Your task is to rearrange the people by their 
heights in a non-descending order without moving the trees. 
'''
def solution(a):
    
    no_tree_arr = []
    for i in a:
        if i != -1:
            no_tree_arr.append(i)
    
    no_tree_arr.sort()
    
    counter = 0
    for i in range(0,len(a)):
        if a[i] != -1:
            a[i] = no_tree_arr[counter]
            counter += 1
    
    return a
