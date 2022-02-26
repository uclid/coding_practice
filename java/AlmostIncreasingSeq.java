/*
Note that this is not a class and only the solution function has been provided below.
Q: Given a sequence of integers as an array, determine whether it is possible to obtain a 
strictly increasing sequence by removing no more than one element from the array.
*/

boolean isSequence(ArrayList<Integer> seq_list){
    for(int i = 0; i < seq_list.size() - 1; i++){
        if(seq_list.get(i) >= seq_list.get(i+1)){
                return false;
        }
    }
    return true;
}

boolean solution(int[] sequence) {

    ArrayList<Integer> seq_list = new ArrayList<Integer>();
    for(int i: sequence){
        seq_list.add(i);
    }
    
    for(int i = 0; i < seq_list.size() - 1; i++){
        if(seq_list.get(i) >= seq_list.get(i+1)){
            ArrayList<Integer> seq_list_2 = (ArrayList<Integer>)seq_list.clone();
            seq_list.remove(i);
            seq_list_2.remove(i+1);
            if(isSequence(seq_list) || isSequence(seq_list_2)){
                return true;
            }else{
                return false;
            }
        }
    }
    
    return true;
}
