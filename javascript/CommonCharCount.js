/*
Q: Given two strings, find the number of common characters between them.
*/

function solution(s1, s2) {
    
    let counter = 0;
    let s2_arr = s2.split('');
    for(let i = 0; i < s1.length; i++){
        let letter = s1.charAt(i);
        for(let j = 0; j < s2_arr.length; j++){
            if(letter == s2_arr[j]){
                counter++;
                s2_arr[j] = '-';
                break;
            }
        }
    }
    
    return counter;
    
}
