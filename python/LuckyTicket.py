'''
Q: Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky 
if the sum of the first half of the digits is equal to the sum of the second half.
Given a ticket number n, determine if it's lucky or not.
'''
def solution(n):
    
    num = str(n);
    half = len(num)/2;
    
    first_half_sum = 0;
    second_half_sum = 0;
    for i in range(0,len(num)):
        if(i < half):
            first_half_sum += int(num[i])
        else:
            second_half_sum += int(num[i])
    
    return first_half_sum == second_half_sum

