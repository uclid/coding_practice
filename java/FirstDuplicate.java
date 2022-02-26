/*
Note that this is not a class and only the solution function has been provided below.
Q: Given an array a that contains only numbers in the range from 1 to a.length, find the first duplicate number for which 
the second occurrence has the minimal index. In other words, if there are more than 1 duplicated numbers, 
return the number for which the second occurrence has a smaller index than the second occurrence of the other 
number does. If there are no such elements, return -1.
*/
int solution(int[] a) {
    int second_index = -1;
    
    HashMap<Integer,Integer> my_map = new HashMap<Integer,Integer>();
    for(int i = 0; i < a.length; i++){
        
        if(my_map.containsKey(a[i])){
            if(second_index == -1){
                second_index = i;
            }else if(i < second_index){
                second_index = i;
            }
        }else{
            my_map.put(a[i], i);
        }
        
    }
    
    return second_index == -1? -1: a[second_index];
}
