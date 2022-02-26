/*
Note that it is not a class and only the solution function is provided.
Q: Given the string, check if it is a palindrome.
*/

boolean solution(String inputString) {
    
    //indexes for comparison
    int start = 0;
    int end = inputString.length()-1;
    
    char[] input_chars = inputString.toCharArray();
    
    while(start < end){
        if(input_chars[start] != input_chars[end]){
            return false;
        }
        start++;
        end--;
    }
    
    return true;
}
