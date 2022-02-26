/*
Note that this is not a class and only the solution function has been provided below.
Q: Given an array strings, determine whether it follows the sequence given in the patterns array. 
In other words, there should be no i and j for which strings[i] = strings[j] and patterns[i] ≠ patterns[j] 
or for which strings[i] ≠ strings[j] and patterns[i] = patterns[j].
*/

boolean solution(String[] strings, String[] patterns) {
    
    for(int i = 0; i < strings.length; i++){
        for(int j = 0; j < patterns.length; j++){
            if(strings[i].equals(strings[j]) && !patterns[i].equals(patterns[j])){
                return false;
            }
            if(!strings[i].equals(strings[j]) && patterns[i].equals(patterns[j])){
                return false;
            }
        }
    }
    
    return true;
    
}
