'''
Q: Two arrays are called similar if one can be obtained from another by 
swapping at most one pair of elements in one of the arrays.
Given two arrays a and b, check whether they are similar.
'''

def solution(a, b):
    
    dict_a = {}
    for x in a:
        if x in dict_a.keys():
            val = dict_a[x]
            dict_a[x] = val + 1
        else:
            dict_a[x] = 1
    
    dict_b = {}
    for x in b:
        if x in dict_b.keys():
            val = dict_b[x]
            dict_b[x] = val + 1
        else:
            dict_b[x] = 1
            
    if dict_a != dict_b:
        return False
    
    unequal_counts = 0;
    for i in range(0,len(a)):
        if a[i] != b[i]:
            unequal_counts += 1
        if unequal_counts > 2:
            return False
    
    return True
