/*
Q: You are given an array of integers. On each move you are allowed to increase 
exactly one of its element by one. Find the minimal number of moves required to 
obtain a strictly increasing sequence from the input.
*/

int solution(vector<int> inputArray) {
    
    vector<int>::iterator it = inputArray.begin();
    int moves = 0;
    for(int i = 1; i < inputArray.size(); i++)    {
        if(it[i] <= it[i-1]){
            int step = it[i-1] - it[i] + 1; //it[i] should be strictly more
            moves += step; //add step to moves
            it[i] += step; //increment curr element by step of this iteration
        }
    }
    
    return moves;
}
