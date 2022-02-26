/*
Note that this is not a class and only the solution function has been provided below.
Q: Given a string s consisting of small English letters, find and return the first instance 
of a non-repeating character in it. If there is no such character, return '_'.
*/

char solution(String s) {
    
    HashMap<Character,Integer> my_map = new HashMap<Character,Integer>();
    int[] nr_indexes = new int[s.length()];
    for(int j = 0; j < nr_indexes.length; j++){
        nr_indexes[j] = -1;
    }
    
    for(int i = s.length()-1; i >= 0; i--){
        char curr_char = s.charAt(i);
        if(!my_map.containsKey(curr_char)){
            my_map.put(curr_char, i);
            //add to a list of non repeat indexes
            nr_indexes[i] = i;
        }else{
            int index = my_map.get(curr_char);
            nr_indexes[i] = -1;
            nr_indexes[index] = -1;
        }
    }
    
    //System.out.println(Arrays.toString(nr_indexes));
    
    for(int j = 0; j < nr_indexes.length; j++){
        if(nr_indexes[j] >= 0){
            return s.charAt(j);
        }
    }
    
    return '_';
}
